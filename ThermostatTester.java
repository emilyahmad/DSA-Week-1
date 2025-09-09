public class ThermostatTester {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(0, 100);

        // OK case
        try {
            t.setTemp(50); // Should be OK.
            System.out.println("Set 50 OK -> " + t);
        } catch (TemperatureOutofRange e) {
            System.out.println("Unexpected: " + e.getMessage());
        }

        // Demonstrate catch ORDER: subclass first, then superclass
        try {
            t.setTemp(150); // Should throw TemperatureTooHigh
        } catch (TemperatureTooHigh e) { // specific FIRST
            System.out.println("Caught high: " + e.getMessage());
        } catch (TemperatureOutofRange e) { // superclass AFTER
            System.out.println("Caught (superclass): " + e.getMessage());
        }

        // Superclass-only catch still catches subclass exceptions
        try {
            t.setTemp(-50); // Should throw TemperatureTooLow
        } catch (TemperatureOutofRange e) { // superclass catches subclass
            System.out.println("Superclass caught: " +
                    e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

        // RETHROW example: log and rethrow to caller
        try {
            setWithLogging(t, -10);
        } catch (TemperatureOutofRange e) {
            System.out.println("Caller caught rethrown: " +
                    e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

        // This would NOT compile (wrong order: superclass before subclass):
        // try {
        // t.setTemp(150);
        // } catch (TemperatureOutofRange e) {
        // } catch (TemperatureTooHigh e) { // unreachable
        // }
    }

    // Helper that catches a subclass and rethrows
    static void setWithLogging(Thermostat t, int temp) throws TemperatureOutofRange {
        try {
            t.setTemp(temp);
            System.out.println("Set " + temp + " OK");
        } catch (TemperatureTooLow e) {
            System.out.println("Logging low, rethrowing -> " + e.getMessage());
            throw e; // rethrow to caller
        }
    }
}

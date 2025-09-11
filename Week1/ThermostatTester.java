public class ThermostatTester {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(0, 100);

        try {
            t.setTemp(66);
            System.out.println("Set 66 OK -> " + t);
        } catch (TemperatureOutofRange e) {
            System.out.println("Unexpected: " + e.getMessage());
        }

        try {
            t.setTemp(138);
        } catch (TemperatureTooHigh e) {
            System.out.println("Caught high: " + e.getMessage());
        } catch (TemperatureOutofRange e) {
            System.out.println("Caught (superclass): " + e.getMessage());
        }

        try {
            t.setTemp(-20);
        } catch (TemperatureOutofRange e) {
            System.out.println("Superclass caught: " +
                    e.getClass().getSimpleName() + " -> " + e.getMessage());
        }

        try {
            setWithLogging(t, -13);
        } catch (TemperatureOutofRange e) {
            System.out.println("Caller caught rethrown: " +
                    e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
    }

    static void setWithLogging(Thermostat t, int temp) throws TemperatureOutofRange {
        try {
            t.setTemp(temp);
            System.out.println("Set " + temp + " OK");
        } catch (TemperatureTooLow e) {
            System.out.println("Logging low, rethrowing -> " + e.getMessage());
        }
    }
}

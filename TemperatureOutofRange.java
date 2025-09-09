public class TemperatureOutofRange extends Exception {
    public final int min, max, attempted;

    public TemperatureOutofRange(String message, int min, int max, int attempted) {
        super(message);
        this.min = min;
        this.max = max;
        this.attempted = attempted;
    }
}

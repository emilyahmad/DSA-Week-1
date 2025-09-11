public class TemperatureTooLow extends TemperatureOutofRange {
    public TemperatureTooLow(int min, int max, int attempted) {
        super("Temperature too low: " + attempted + " < " + min, min, max, attempted);
    }
}

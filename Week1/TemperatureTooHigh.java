public class TemperatureTooHigh extends TemperatureOutofRange {
    public TemperatureTooHigh(int min, int max, int attempted) {
        super("Temperature too high: " + attempted + " > " + max, min, max, attempted);
    }
}

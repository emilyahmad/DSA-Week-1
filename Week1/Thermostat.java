public class Thermostat {
    private final int min;
    private final int max;
    private int current;

    public Thermostat(int min, int max) {
        if (min > max)
            throw new IllegalArgumentException("min must be <= max");
        this.min = min;
        this.max = max;
        this.current = min;
    }

    public void setTemp(int t) throws TemperatureOutofRange {
        if (t < min)
            throw new TemperatureTooLow(min, max, t);
        if (t > max)
            throw new TemperatureTooHigh(min, max, t);
        this.current = t;
    }

    public int getTemp() {
        return current;
    }

    @Override
    public String toString() {
        return "Thermostat[temp=" + current + ", range=" + min + "…" + max + "]";
    }
}

package upm.xp.xp_tdd;

public abstract class Interval {

    protected double min;
    protected double max;

    public Interval(double min, double max) {
        this.min = min;
        this.max = max;
    }
    
    protected abstract boolean isIncluded(double value);
}

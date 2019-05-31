package upm.xp.xp_tdd;

public class Interval {

    protected double min;
    protected double max;
    MinLimit minLimit;
    MaxLimit maxLimit;

    public Interval(MinLimit minLimit, MaxLimit maxLimit) {
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
        this.min = minLimit.getValue();
        this.max = maxLimit.getValue();
    }
    
    protected boolean isIncluded(double value) {
        return minLimit.isMatch(value) && maxLimit.isMatch(value);
    }
}

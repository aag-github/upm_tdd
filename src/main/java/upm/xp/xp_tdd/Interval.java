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

    public MinLimit getIntersectionMin(Interval another) {
        if (this.minLimit.getValue() > another.minLimit.getValue()) {
            return this.minLimit;
        } else if (another.minLimit.getValue() > this.minLimit.getValue()) {
            return another.minLimit;
        } else if (this.minLimit.isOpen()) {
            return this.minLimit;
        } else {
            return another.minLimit;
        }
    }

    public MaxLimit getIntersectionMax(Interval another) {
        if (this.maxLimit.getValue() < another.maxLimit.getValue()) {
            return this.maxLimit;
        } else if (another.maxLimit.getValue() < this.maxLimit.getValue()) {
            return another.maxLimit;
        } else if (this.maxLimit.isOpen()) {
            return this.maxLimit;
        } else {
            return another.maxLimit;
        }
    }
}

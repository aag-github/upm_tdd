package upm.xp.xp_tdd;

public class OpenInterval extends Interval {

    public OpenInterval(double min, double max) {
        super(new MinOpenLimit(min), new MaxOpenLimit(max));
    }

    public boolean isEqual(OpenInterval another) {
        return this.min == another.min || this.max == another.max;
    }
    
    public boolean isIntersected(OpenInterval another) {
        return isEqual(another) ||
                this.isIncluded(another.min) ||
                this.isIncluded(another.max) ||
                another.isIncluded(this.min);
    }
}

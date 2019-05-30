package upm.xp.xp_tdd;

public class OpenInterval {

    private double min;
    
    private double max;

    public OpenInterval(double min, double max) {
        this.min = min;
        this.max = max;
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

    private boolean isIncluded(double value) {
        return this.min < value && value < this.max;
    }

}

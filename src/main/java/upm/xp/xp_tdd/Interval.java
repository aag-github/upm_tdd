package upm.xp.xp_tdd;

public class Interval {

    MinLimit minLimit;
    MaxLimit maxLimit;

    public Interval(MinLimit minLimit, MaxLimit maxLimit) {
        assert(minLimit.getValue() <= maxLimit.getValue());
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }
    
    // Si nos ceñimos exclusivamente a esta práctica, este método debería borrarse, ya que es código muerto,
    // pero en una situación de uso de la clase para alguna funcionalidad real, entiendo que este método
    // es probable que fuera necesario. 
    protected boolean isIncluded(double value) {
        return minLimit.isMatch(value) && maxLimit.isMatch(value);
    }
    
    public MinLimit getMaximumOfMinLimits(Interval another) {
        if (this.minLimit.getValue() > another.minLimit.getValue()) {
            return this.minLimit;
        } else if (another.minLimit.getValue() > this.minLimit.getValue()) {
            return another.minLimit;
        } else {
            return this.minLimit.isOpen() ? this.minLimit : another.minLimit;
        }
    }

    public MaxLimit getMinimumOfMaxLimits(Interval another) {
        if (this.maxLimit.getValue() < another.maxLimit.getValue()) {
            return this.maxLimit;
        } else if (another.maxLimit.getValue() < this.maxLimit.getValue()) {
            return another.maxLimit;
        } else {
            return this.maxLimit.isOpen() ? this.maxLimit : another.maxLimit;
        }
    }

    public boolean isIntersected(Interval another) {
        MinLimit min = this.getMaximumOfMinLimits(another);
        MaxLimit max = this.getMinimumOfMaxLimits(another);

        if (min.getValue() == max.getValue()) {
            return min.isClosed() && max.isClosed();
        } else {
            return min.getValue() < max.getValue();
        }
    }
}

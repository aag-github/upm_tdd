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

    public boolean isIntersected(Interval another) {
        MinLimit min = this.getIntersectionMin(another);
        MaxLimit max = this.getIntersectionMax(another);

        if (min.getValue() == max.getValue()) {
            return min.isClosed() && max.isClosed();
        } else {
            return min.getValue() < max.getValue();
        }
    }
}

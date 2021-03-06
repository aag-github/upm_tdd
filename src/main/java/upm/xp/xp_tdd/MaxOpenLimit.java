package upm.xp.xp_tdd;

public class MaxOpenLimit extends MaxLimit {
    public MaxOpenLimit(double value) {
        super(value);
    }

    @Override
    public boolean isIncluded(double target) {
        return target < value;
    }
}

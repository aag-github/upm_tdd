package upm.xp.xp_tdd;

public class MaxClosedLimit extends MaxLimit {
    public MaxClosedLimit(double value) {
        super(value);
    }

    @Override
    public boolean isMatch(double target) {
        return target <= value;
    }
}

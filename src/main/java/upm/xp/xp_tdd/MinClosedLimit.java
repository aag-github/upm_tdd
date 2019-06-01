package upm.xp.xp_tdd;

public class MinClosedLimit extends MinLimit {
    public MinClosedLimit(double value) {
        super(value);
    }

    @Override
    public boolean isIncluded(double target) {
        return target >= this.value;
    }
}

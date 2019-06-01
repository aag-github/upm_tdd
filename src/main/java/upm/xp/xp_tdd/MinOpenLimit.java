package upm.xp.xp_tdd;

public class MinOpenLimit extends MinLimit {
    public MinOpenLimit(double value) {
        super(value);
    }

    @Override
    public boolean isIncluded(double target) {
        return target > this.value;
    }
}

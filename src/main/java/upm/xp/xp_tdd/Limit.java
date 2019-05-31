package upm.xp.xp_tdd;

public abstract class Limit {
    protected double value;
    
    public Limit(double value) {
        this.value = value;
    }
    
    public abstract boolean isMatch(double target);
    
    public boolean isClosed() {
        return isMatch(this.value);
    }
}

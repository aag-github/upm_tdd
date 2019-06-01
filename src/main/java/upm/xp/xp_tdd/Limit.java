package upm.xp.xp_tdd;

public abstract class Limit {
    protected double value;
    
    public Limit(double value) {
        this.value = value;
    }
    
    public abstract boolean isIncluded(double target);
    
    public boolean isClosed() {
        return isIncluded(this.value);
    }
    
    public boolean isOpen() {
        return !isClosed();
    }
    
    public double getValue() {
        return value;
    }
}

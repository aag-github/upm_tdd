package upm.xp.xp_tdd;

public class IntervalBuilder {
    public static final String MIN_OPEN = "("; 
    public static final String MIN_CLOSED = "["; 
    public static final String MAX_OPEN = ")"; 
    public static final String MAX_CLOSED = "]"; 
    
    public IntervalBuilder() {
        
        this.min = Double.MIN_VALUE;

        this.max = Double.MAX_VALUE;
        
        minClosed = true;
        
        maxClosed = true;
    }
    
    public IntervalBuilder withMin(double min) {
        this.min = min;
        return this;
    }
    
    public IntervalBuilder withMax(double max) {
        this.max = max;
        return this;
    }
    
    public IntervalBuilder withMinType(String limitType) {
        assert(limitType == MIN_OPEN || limitType == MIN_CLOSED);
        minClosed = limitType == MIN_CLOSED;
        return this;
    }
    
    public IntervalBuilder withMaxType(String limitType) {
        assert(limitType == MAX_OPEN || limitType == MAX_CLOSED);
        maxClosed = limitType == MAX_CLOSED;
        return this;
    }
    
    public Interval build() {
        MinLimit min = minClosed ? new MinClosedLimit(this.min) : new MinOpenLimit(this.min);
        MaxLimit max = maxClosed ? new MaxClosedLimit(this.max) : new MaxOpenLimit(this.max);
        return new Interval(min, max);
    }
    
    private double min;

    private double max;
    
    private boolean minClosed;
    
    private boolean maxClosed;
}

package upm.xp.xp_tdd;

public class ClosedInterval extends Interval {

	public ClosedInterval(double min, double max) {
	    super(new MinClosedLimit(min), new MaxClosedLimit(max));
	}
}

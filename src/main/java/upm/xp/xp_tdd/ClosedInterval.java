package upm.xp.xp_tdd;

public class ClosedInterval extends Interval {

	public ClosedInterval(double min, double max) {
	    super(min, max);
	}

	public boolean isIntersected(ClosedInterval another) {
		return this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	@Override
	protected boolean isIncluded(double value) {
		return this.min <= value && value <= this.max;
	}

}

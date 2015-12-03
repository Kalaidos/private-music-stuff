package base.tones;

public class Interval {
	
	private final IntervalPrefix prefix;
	private final DegreeInterval interval;
	
	
	public Interval(IntervalPrefix prefix, DegreeInterval interval) {
		this.prefix = prefix;
		this.interval = interval;
	}
	
	public String getName() {
		return prefix.getName() + " " + interval.getName();
	}
	
	public int getHalfSteps() {
		return this.interval.getHalfSteps() + this.prefix.getModifier();
	}
	
	public int getWholeSteps() {
		return this.interval.getWholeSteps();
	}

}

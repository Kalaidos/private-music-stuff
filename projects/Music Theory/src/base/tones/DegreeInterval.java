package base.tones;

public enum DegreeInterval {
	
	UNISON("Unison", 0, 0, true),
	SECOND("Second", 1, 2, false),
	THIRD("Third", 2, 4, false),
	FOURTH("Fourth", 3, 5, true),
	FIFTH("Fifth", 4, 7, true),
	SIXTH("Sixth", 5, 9, false),
	SEVENTH("Seventh", 6, 11, false)
	
	;
	
	private final int wholeSteps;
	private final int halfSteps;
	private final String name;
	private boolean perfectInterval;

	private DegreeInterval(String name, int wholeSteps, int halfSteps, boolean perfectInterval) {
		this.wholeSteps = wholeSteps;
		this.halfSteps = halfSteps;
		this.name = name;
		this.perfectInterval = perfectInterval;
	}
	
	
	public String getName() { return this.name; }
	
	public boolean isPerfect() { return this.perfectInterval; }
	
	public int getWholeSteps() { return this.wholeSteps; }
	public int getHalfSteps() { return this.halfSteps; }
}

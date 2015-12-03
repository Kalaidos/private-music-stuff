package base.tones;

public enum Mode {

	MAJOR("Major", 7, new Interval[] {			new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.SEVENTH),
												}),
	DORIAN("Dorian", 7, new Interval[] {		new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH),
												}),
	PHRYGIAN("Phrygian", 7, new Interval[] {	new Interval(IntervalPrefix.MINOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH),
												}),
	LYDIAN("Lydian", 7, new Interval[] {		new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.P_AUGMENTED, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MAJOR, DegreeInterval.SEVENTH),
												}),
	MIXOLYDIAN("Mixolydian", 7, new Interval[] {		new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND),
														new Interval(IntervalPrefix.MAJOR, DegreeInterval.THIRD),
														new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
														new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
														new Interval(IntervalPrefix.MAJOR, DegreeInterval.SIXTH),
														new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH),
												}),
	MINOR("Minor", 7, new Interval[] {			new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH),
												}),
	LOCRIAN("Locrian", 7, new Interval[] {		new Interval(IntervalPrefix.MINOR, DegreeInterval.SECOND),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.THIRD),
												new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH),
												new Interval(IntervalPrefix.P_DIMINISHED, DegreeInterval.FIFTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SIXTH),
												new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH),
												}),
	
	;
	
	private final String name;
	private final int toneCount;
	private final Interval[] intervals;
	
	private Mode(String name, int toneCount, Interval[] intervals) {
		this.name = name;
		this.toneCount = toneCount;
		this.intervals = intervals;
		
	}
	
	public String getName() { return this.name; }
	public int getToneCount() { return this.toneCount; }
	public Interval[] getIntervals() { return this.intervals; }
}

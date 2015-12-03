package base.tones;

public enum Tone {

	
	C("C", 0, 0),
	Cflat("Cb", 0, 11),
	Csharp("C#", 0, 1),
	Cdoubleflat("Cbb", 0, 10),
	Cdoublesharp("C##", 0, 2),
	D("D", 1, 2),
	Dflat("Db", 1, 1),
	Dsharp("D#", 1, 3),
	Ddoubleflat("Dbb", 1, 0),
	Ddoublesharp("D##", 1, 4),
	E("E", 2, 4),
	Eflat("Eb", 2, 3),
	Esharp("E#", 2, 5),
	Edoubleflat("Ebb", 2, 2),
	Edoublesharp("E##", 2, 6),
	F("F", 3, 5),
	Fflat("Fb", 3, 4),
	Fsharp("F#", 3, 6),
	Fdoubleflat("Fbb", 3, 3),
	Fdoublesharp("F##", 3, 7),
	G("G", 4, 7),
	Gflat("Gb", 4, 6),
	Gsharp("G#", 4, 8),
	Gdoubleflat("Gbb", 4, 5),
	Gdoublesharp("G##", 4, 9),
	A("A", 5, 9),
	Aflat("Ab", 5, 8),
	Asharp("A#", 5, 10),
	Adoubleflat("Abb", 5, 7),
	Adoublesharp("A##", 5, 11),
	B("B", 6, 11),
	Bflat("Bb", 6, 10),
	Bsharp("B#", 6, 0),
	Bdoubleflat("Bbb", 6, 9),
	Bdoublesharp("B##", 6, 1);
	
	
	private final String name;
	private final int wholeIndex; // Position in a major / minor scale
	private final int semiIndex;  // Effective distance from C in half tones
	
	private Tone(String name, int wholeIndex, int semiIndex) {
		this.name = name;
		this.wholeIndex = wholeIndex;
		this.semiIndex = semiIndex;
	}
	
	public String getName() { return this.name; }
	
	public int getWholeIndex() { return this.wholeIndex; }
	
	public int getSemiIndex() { return this.semiIndex; }
	
	public Tone getEnharmonicTone() {
		for (Tone searchTone : Tone.values())
			if (searchTone != this && searchTone.semiIndex == this.semiIndex)
				return searchTone;
		return this;
	}
	
	public Tone getToneAboveInInterval(Interval interval) {
		for (Tone searchTone : Tone.values())
			if (searchTone.wholeIndex == ((this.wholeIndex  + interval.getWholeSteps() + 7) % 7) && searchTone.semiIndex == ((this.semiIndex + interval.getHalfSteps() + 12) % 12))
				return searchTone;
		return null;
	}
	
	public Tone getToneBelowInInterval(Interval interval) {
		for (Tone searchTone : Tone.values())
			if (searchTone.wholeIndex == ((this.wholeIndex - interval.getWholeSteps() + 7) % 7) && searchTone.semiIndex == ((this.semiIndex - interval.getHalfSteps() + 12) % 12))
				return searchTone;
		return null;
	}
	
	public Interval determineIntervalToAbove(Tone otherTone) {
		DegreeInterval interval = DegreeInterval.UNISON;
		IntervalPrefix prefix = IntervalPrefix.MAJOR;
		
		// Get Main Interval
		for (DegreeInterval degreeInterval : DegreeInterval.values())
			if (degreeInterval.getWholeSteps() == ((otherTone.wholeIndex - this.wholeIndex + 7) % 7))
				interval = degreeInterval;
		
		// Get Prefix
		for (IntervalPrefix prefixInterval : IntervalPrefix.values())
			if (prefixInterval.isPerfect() == interval.isPerfect() && ((interval.getHalfSteps() + prefixInterval.getModifier() + 12) % 12) == ((otherTone.semiIndex  - this.semiIndex + 12) % 12))
				prefix = prefixInterval;
		
		return new Interval(prefix, interval);
	}
	
	public Interval determineIntervalToBelow(Tone otherTone) {
		DegreeInterval interval = DegreeInterval.UNISON;
		IntervalPrefix prefix = IntervalPrefix.MAJOR;
		
		// Get Main Interval
		for (DegreeInterval degreeInterval : DegreeInterval.values())
			if (degreeInterval.getWholeSteps() == ((this.wholeIndex - otherTone.wholeIndex + 7) % 7))
				interval = degreeInterval;
		
		// Get Prefix
		for (IntervalPrefix prefixInterval : IntervalPrefix.values())
			if (prefixInterval.isPerfect() == interval.isPerfect() && ((interval.getHalfSteps() + prefixInterval.getModifier() + 12) % 12) == ((this.semiIndex - otherTone.semiIndex + 12) % 12))
				prefix = prefixInterval;
		
		return new Interval(prefix, interval);
	}
	
	
	
}

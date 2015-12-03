package base.intervals;

import base.tone.ITone;

public enum Interval {
	
	UNISON_PERFECT(0,0, "Unison"),
	UNISON_DIMINISHED(-1,0, "Diminished Unison"),
	UNISON_AUGMENTED(1,0, "Augmented Unison"),
	
	SECOND_MAJOR(2,1, "Major Second"),
	SECOND_MINOR(1,1, "Minor Second"),
	SECOND_AUGMENTED(3,1, "Augmented Second"),
	SECOND_DIMINISHED(0,1, "Diminished Second"),
	
	THIRD_MAJOR(4,2, "Major Third"),
	THIRD_MINOR(3,2, "Minor Third"),
	THIRD_AUGMENTED(5,2, "Augmented Third"),
	THIRD_DIMINISHED(2,2, "Diminished Third"),
	
	FOURTH_PERFECT(5,3, "Perfect Fourth"),
	FOURTH_DIMINISHED(4,3, "Diminished Fourth"),
	FOURTH_AUGMENTED(6,3, "Augmented Fourth"),
	
	FIFTH_PERFECT(7,4, "Perfect Fifth"),
	FIFTH_DIMINISHED(6,4, "Diminished Fifth"),
	FIFTH_AUGMENTED(8,4, "Augmented Fifth"),
	
	SIXTH_MAJOR(9,5, "Major Sixth"),
	SIXTH_MINOR(8,5, "Minor Sixth"),
	SIXTH_AUGMENTED(10,5, "Augmented Sixth"),
	SIXTH_DIMINISHED(7,5, "Diminished Sixth"),
	
	SEVENTH_MAJOR(11,6, "Major Seventh"),
	SEVENTH_MINOR(10,6, "Minor Seventh"),
	SEVENTH_AUGMENTED(12,6, "Augmented Seventh"),
	SEVENTH_DIMINISHED(9,6, "Diminished Seventh"),
	
	// OCTAVE?
	OCTAVE_PERFECT(12,7, "Octave"),
	OCTAVE_DIMINISHED(11,7, "Diminished Octave"),
	OCTAVE_AUGMENTED(13,7, "Augmented Octave"),
	
	INVALID_INTERVAL(99,99, "Invalid Interval");
	
	private int semitoneSteps;
	private int coreSteps;
	private String name;

	Interval(int semitoneSteps, int coreSteps, String name) {
		this.semitoneSteps = semitoneSteps;
		this.coreSteps = coreSteps;
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public static Interval getIntervalByDistances(int semitoneSteps, int coreSteps) {
		for (Interval interv : Interval.values())
			if (interv.coreSteps == coreSteps && interv.semitoneSteps == semitoneSteps)
				return interv;
		return Interval.INVALID_INTERVAL;
	}
	
	public static Interval getComplementary(Interval interv) {
		int complCoreSteps = 7 - interv.coreSteps;
		int complSemitoneSteps = 12 - interv.semitoneSteps;
		return getIntervalByDistances(complSemitoneSteps, complCoreSteps);
	}
	
	public static Interval getIntervalByTones(ITone tone1, ITone tone2) {
		int intervCoreSteps = (tone1.getToneIndex() - tone2.getToneIndex());
		if (intervCoreSteps < 0) intervCoreSteps += 7;
		int intervSemitoneSteps = (tone1.getTrueIndex() - tone2.getTrueIndex());
		if (intervSemitoneSteps < 0) intervSemitoneSteps += 12;
		return getIntervalByDistances(intervSemitoneSteps, intervCoreSteps);
	}
}

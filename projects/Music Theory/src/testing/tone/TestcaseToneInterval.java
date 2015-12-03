package testing.tone;

import base.tones.DegreeInterval;
import base.tones.Interval;
import base.tones.IntervalPrefix;
import base.tones.Tone;

public class TestcaseToneInterval {

	
	public TestcaseToneInterval() {
		Interval testInterval;
		Tone testTone;
		
		testTone = Tone.C;
		testInterval = new Interval(IntervalPrefix.PERFECT, DegreeInterval.UNISON);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MINOR, DegreeInterval.SECOND);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MINOR, DegreeInterval.THIRD);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MAJOR, DegreeInterval.THIRD);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.PERFECT, DegreeInterval.FIFTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MINOR, DegreeInterval.SIXTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MAJOR, DegreeInterval.SIXTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MINOR, DegreeInterval.SEVENTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.MAJOR, DegreeInterval.SEVENTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		
		
		
		
		
//		testInterval = new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH);
//		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.P_DIMINISHED, DegreeInterval.FIFTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.P_AUGMENTED, DegreeInterval.FOURTH);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		testInterval = new Interval(IntervalPrefix.M_AUGMENTED, DegreeInterval.THIRD);
		System.out.println("Interval: " + testInterval.getName() + ", Tone: " + testTone.getName() + " -> " + testTone.getToneAboveInInterval(testInterval).getName());
		
		
	}
}

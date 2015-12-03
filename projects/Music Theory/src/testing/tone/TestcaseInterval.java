package testing.tone;

import base.tones.DegreeInterval;
import base.tones.Interval;
import base.tones.IntervalPrefix;

public class TestcaseInterval {

	
	public TestcaseInterval() {
		Interval testInterval;
		
		testInterval = new Interval(IntervalPrefix.MAJOR, DegreeInterval.SECOND);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		testInterval = new Interval(IntervalPrefix.MINOR, DegreeInterval.SECOND);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		testInterval = new Interval(IntervalPrefix.PERFECT, DegreeInterval.FOURTH);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		testInterval = new Interval(IntervalPrefix.P_DIMINISHED, DegreeInterval.FIFTH);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		testInterval = new Interval(IntervalPrefix.P_AUGMENTED, DegreeInterval.FOURTH);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		testInterval = new Interval(IntervalPrefix.M_AUGMENTED, DegreeInterval.THIRD);
		System.out.println("Interval: " + testInterval.getName() + " -> " + testInterval.getHalfSteps());
		
		
	}
}

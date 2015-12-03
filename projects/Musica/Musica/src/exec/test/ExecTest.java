package exec.test;

import base.intervals.Interval;

public class ExecTest {

	public static void main(String[] args) {
		
		// Some Interval Tests
		
		Interval interv1;
		
		/* Test 1 */
		IntervalTestCompl(Interval.SECOND_MAJOR);
		IntervalTestCompl(Interval.SEVENTH_MINOR);
		IntervalTestCompl(Interval.THIRD_DIMINISHED);
		IntervalTestCompl(Interval.SIXTH_AUGMENTED);
		
		IntervalTestCompl(Interval.THIRD_AUGMENTED);
		IntervalTestCompl(Interval.FOURTH_DIMINISHED);
		IntervalTestCompl(Interval.FIFTH_DIMINISHED);
		
		IntervalTestCompl(Interval.UNISON_DIMINISHED);
		IntervalTestCompl(Interval.UNISON_AUGMENTED);
		IntervalTestCompl(Interval.UNISON_PERFECT);
		
		IntervalTestCompl(Interval.FOURTH_PERFECT);
		IntervalTestCompl(Interval.FIFTH_PERFECT);
		
		
	}
	
	private static void IntervalTestCompl(Interval interv) {
		Interval interv2;
		interv2 = Interval.getComplementary(interv);
		
		System.out.println("Complementary Interval Test:");
		System.out.println("Original Interval: " + interv.getName());
		System.out.println("Compl. Interval: " + interv2.getName());
		System.out.println("**************************************************");
		
	}

}

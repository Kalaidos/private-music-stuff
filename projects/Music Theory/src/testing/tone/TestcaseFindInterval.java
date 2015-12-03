package testing.tone;

import base.tones.Tone;

public class TestcaseFindInterval {

	public TestcaseFindInterval() {
		Tone testTone = Tone.E;
		Tone otherTone = Tone.D;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		
		otherTone = Tone.E;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.F;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.Fsharp;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.Gflat;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.A;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.B;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.Eflat;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
		otherTone = Tone.Dsharp;
		System.out.println("Tone: " + testTone.getName() + ", Other Tone: " + otherTone.getName() + " -> " + testTone.determineIntervalToAbove(otherTone).getName());
	
		
		System.out.print((-1) % 7);
	}
}

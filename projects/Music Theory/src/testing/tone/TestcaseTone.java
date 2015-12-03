package testing.tone;

import base.tones.Tone;

public class TestcaseTone {

	public TestcaseTone() {
		Tone testTone = Tone.C;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.Cflat;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.Csharp;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.E;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.Esharp;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.F;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.Asharp;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
		testTone = Tone.B;
		System.out.println("Enharmonic of: " + testTone.getName() + " -> " + testTone.getEnharmonicTone().getName());
	}
}

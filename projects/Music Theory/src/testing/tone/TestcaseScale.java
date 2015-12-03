package testing.tone;

import base.tones.Mode;
import base.tones.Scale;
import base.tones.Tone;

public class TestcaseScale {
	
	
	public TestcaseScale() {
		Scale testScale = null;
		
		testScale = new Scale(Tone.C, Mode.MAJOR);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());
		
		testScale = new Scale(Tone.C, Mode.DORIAN);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());

		testScale = new Scale(Tone.C, Mode.PHRYGIAN);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());

		testScale = new Scale(Tone.C, Mode.LYDIAN);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());

		testScale = new Scale(Tone.C, Mode.MIXOLYDIAN);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());

		testScale = new Scale(Tone.C, Mode.MINOR);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());
		
		testScale = new Scale(Tone.C, Mode.LOCRIAN);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());
		
		testScale = new Scale(Tone.Csharp, Mode.MAJOR);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());
		
		testScale = new Scale(Tone.Dflat, Mode.MAJOR);
		System.out.println("Notes of: " + testScale.getName() + " -> " + testScale.getToneNames());
		
	}


		

}

package tones;

public class Tone {

	private FixTone fixTone;
	private int octave;
	
	public Tone (FixTone fixTone, int octave) { 
		this.fixTone = fixTone;
		this.octave = octave;
	}
	
	public int getFullValue() {
		return this.fixTone.getToneValue() + (12 * octave);
	}
	
}

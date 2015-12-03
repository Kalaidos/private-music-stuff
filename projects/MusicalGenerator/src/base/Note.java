package base;

public class Note {

	private final int toneValue;		// 0 = C-1, 60 = C4 127 = G9
	
	public Note(int toneValue) {
		this.toneValue = toneValue;
	}
	
	public Note(Tone tone, int octave) {
		this.toneValue = tone.getValue() + (12 * (octave + 1));
	}
	
	public int getToneValue() { return toneValue; }
	
	public int getShortIntervalTo(Note other) {
		return (other.getToneValue() - this.toneValue) % 12;
	}
	
	public String toString() {
		return "" + this.toneValue;
	}
}

package tones;

public class FixTone {
	
	private RootTone root;
	private Accidental accidental;
	
	public FixTone(RootTone root, Accidental accidental) {
		this.root = root;
		this.accidental = accidental;
	}
	
	public int getToneValue() {
		return root.getToneValue() + accidental.getModifier();
	}
	
	public String toString() { return root.toString() + accidental.toString(); }

}

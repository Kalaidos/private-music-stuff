package tones;

public enum RootTone {

	C(0, "C"),
	D(2, "D"),
	E(4, "E"),
	F(5, "F"),
	G(7, "G"),
	A(9, "A"),
	B(11, "B");
	
	private int toneValue;
	private String textRep;
	
	RootTone(int toneValue, String textRep) {
		this.toneValue = toneValue;
		this.textRep = textRep;
	}
	
	public int getToneValue() { return this.toneValue;	}
	public String toString() { return this.textRep; }
	
	
}

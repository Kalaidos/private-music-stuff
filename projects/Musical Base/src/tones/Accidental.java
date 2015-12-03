package tones;

public enum Accidental {

	NONE(0, ""),
	SHARP(1, "#"),
	DOUBLESHARP(2, "x"),
	FLAT(-1, "b"),
	DOUBLEFLAT(-2, "bb");
	
	private int modifier;
	private String textRep;
	
	Accidental(int modifier, String textRep) {
		this.modifier = modifier;
		this.textRep = textRep;
	}
	
	public int getModifier() { return this.modifier; }
	public String toString() { return this.textRep;}
}

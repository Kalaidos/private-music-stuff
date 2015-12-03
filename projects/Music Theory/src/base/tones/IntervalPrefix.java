package base.tones;

public enum IntervalPrefix {

	MAJOR("Major", 0, false),
	MINOR("Minor", -1, false),
	M_DIMINISHED("Diminished", -2, false),
	M_AUGMENTED("Augmented", 1, false),
	PERFECT("Perfect", 0, true),
	P_DIMINISHED("Diminished", -1, true),
	P_AUGMENTED("Augmented", 1, true),
	;
	
	private final String name;
	private final int modifier;
	private final boolean perfect;
	
	
	private IntervalPrefix(String name, int modifier, boolean perfect) {
		this.name = name;
		this.modifier = modifier;
		this.perfect = perfect;
	}
	
	public String getName() { return this.name; }
	public int getModifier() { return this.modifier; }
	
	public boolean isPerfect() { return this.perfect; }
}

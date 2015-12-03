package notes;


public enum ScaleMode {

	MAJOR("Major", new int[]{2, 2, 1, 2, 2, 2, 1}), // Ionian
	DORIAN("Dorian", new int[]{2, 1, 2, 2, 2, 1, 2}),
	PHRYGIAN("Phrygian", new int[]{1, 2, 2, 2, 1, 2, 2}),
	LYDIAN("Lydian", new int[]{2, 2, 2, 1, 2, 2, 1}),
	MIXOLYDIAN("Mixolydian", new int[]{2, 2, 1, 2, 2, 1, 2}),
	MINOR_NATURAL("Natural Minor", new int[]{2, 1, 2, 2, 1, 2, 2}), // Aelion
	MINOR_HARMONIC("Harmonic Minor", new int[]{2, 1, 2, 2, 1, 3, 1}),
	MINOR_MELODIC("Melodic Minor", new int[]{2, 1, 2, 2, 2, 2, 1}),
	LOCRIAN("Locrian", new int[]{1, 2, 2, 1, 2, 2, 2});
	
	private final int[] steps;
	private final String name;
	
	private ScaleMode(String name, int[] steps) {
		this.name = name;
		this.steps = steps;
	}
	
	public int[] getSteps() { return this.steps;}
	public String getName() { return this.name;}
}

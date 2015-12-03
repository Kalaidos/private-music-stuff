package notes;

public enum ChordType {

	MAJOR("", 4, 7),
	MINOR("m", 3, 7),
	DIMINISHED("dim", 3, 6),
	AUGMENTED("aug", 4, 8),
	;
	private final int interval1;
	private final int interval2;
	private final String name;
	
	private ChordType(String name, int interval1, int interval2) {
		this.interval1 = interval1;
		this.interval2 = interval2;
		this.name = name;
	}
	
	public int getInterval1() {
		return this.interval1;
	}
	
	public int getInterval2() {
		return this.interval2;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}

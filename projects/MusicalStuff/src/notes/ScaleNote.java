package notes;

public enum ScaleNote {

	I(0, "I"),
	II(1, "II"),
	III(2, "III"),
	IV(3, "IV"),
	V(4, "V"),
	VI(5, "VI"),
	VII(6, "VII");
	
	private final int index;
	private final String name;
	
	private ScaleNote(int index, String name) {
		this.index = index;
		this.name = name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getName() {
		return this.name;
	}
}

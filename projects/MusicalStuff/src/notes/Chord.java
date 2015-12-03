package notes;

public class Chord {
	
	private final Tone root;
	private final Tone third;
	private final Tone fifth;
	private final ChordType type;
	
	public Chord (Tone root, ChordType type) {
		this.root = root;
		this.type = type;
		this.third = root.getToneInInterval(type.getInterval1());
		this.fifth = root.getToneInInterval(type.getInterval2());
	}
	
	public Chord (Tone root, Tone third, Tone fifth) {
		this.root = root;
		this.third = third;
		this.fifth = fifth;
		this.type = resolveChordType();
	}
	
	private ChordType resolveChordType() {
		if (root.getInterval(third) == 3)
			// Minor
			if (root.getInterval(fifth) == 7)
				return ChordType.MINOR;
			else
				return ChordType.DIMINISHED;
		else
			if (root.getInterval(fifth) == 7)
				return ChordType.MAJOR;
			else
				return ChordType.AUGMENTED;
	}
	
	public Tone[] getTones() {
		Tone[] tones = new Tone[3];
		tones[0] = root;
		tones[1] = third;
		tones[2] = fifth;
		return tones;
	}
	
	public ChordType getChordType() { return this.type;}		
	
	public boolean equals(Chord otherChord) {
		return (this.root == otherChord.root && this.type == otherChord.type);
	}
	
	public String getChordName() {
		return root.getName() + type.getName();
	}

}

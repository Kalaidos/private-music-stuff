
public class Instrument {

	
	private byte lowNote;
	private byte highNote;
	
	private byte lowBest;
	private byte highBest;
	
	private byte lowOptional;
	private byte highOptional;
	
	private String name;
	
	private int instID;
	private int family;
	
	public static int VIOLIN1 = 1;
	public static int VIOLIN2 = 2;
	public static int VIOLA = 3;
	public static int CELLO = 4;
	public static int DOUBLEBASS = 5;
	
	public static int FLUTE = 6;
	public static int OBOE = 7;
	public static int CLARINET = 8;
	public static int BASSOON = 9;
	
	public static int TRUMPET = 10;
	public static int HORN = 11;
	public static int TROMBONE = 12;
	public static int TUBA = 13;
	
	
	public static int STRINGS = 1;
	public static int WOODWINDS = 2;
	public static int BRASS = 3;
	
	public Instrument (String name, String lowNote, String highNote, int instID, int family) {
		this.name = name;
		this.lowNote = ByteNoteConverter.parseToByte(lowNote);
		this.highNote = ByteNoteConverter.parseToByte(highNote);
		this.instID = instID;
		this.family = family;
	}
	
	public Instrument (String name, String lowNote, String highNote, String lowBest, String highBest, int instID, int family) {
		this.name = name;
		this.lowNote = ByteNoteConverter.parseToByte(lowNote);
		this.highNote = ByteNoteConverter.parseToByte(highNote);
		this.instID = instID;
		this.family = family;
		
		this.lowBest = ByteNoteConverter.parseToByte(lowBest);
		this.highBest = ByteNoteConverter.parseToByte(highBest);
	}
	
	public Instrument (String name, String lowNote, String highNote, String lowBest, String highBest, String lowOptional, String highOptional, int instID, int family) {
		this.name = name;
		this.lowNote = ByteNoteConverter.parseToByte(lowNote);
		this.highNote = ByteNoteConverter.parseToByte(highNote);
		this.instID = instID;
		this.family = family;
		
		this.lowBest = ByteNoteConverter.parseToByte(lowBest);
		this.highBest = ByteNoteConverter.parseToByte(highBest);
		
		this.lowOptional = ByteNoteConverter.parseToByte(lowOptional);
		this.highOptional = ByteNoteConverter.parseToByte(highOptional);
	}

	public byte getLowNote() {
		return lowNote;
	}

	public byte getHighNote() {
		return highNote;
	}

	public byte getLowBest() {
		return lowBest;
	}

	public byte getHighBest() {
		return highBest;
	}

	public byte getLowOptional() {
		return lowOptional;
	}

	public byte getHighOptional() {
		return highOptional;
	}

	public String getName() {
		return name;
	}

	public int getInstID() {
		return instID;
	}

	public int getFamily() {
		return family;
	}
}

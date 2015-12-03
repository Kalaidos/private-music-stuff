import java.util.ArrayList;
import java.util.List;


public class InstrumentLoader {
	
	
	public static List<Instrument> getAllInstruments () {

		List<Instrument> instruments = new ArrayList<Instrument>();
		instruments.addAll(getAllStrings());
		instruments.addAll(getAllWoodwinds());
		instruments.addAll(getAllBrass());

		return instruments;
	}
	
	public static List<Instrument> getAllStrings() {
		
		List<Instrument> instruments = new ArrayList<Instrument>();
		
		instruments.add(new Instrument("Violin I", "G3", "D7", "C4", "C6", "C4", "A6", Instrument.VIOLIN1, Instrument.STRINGS));
		instruments.add(new Instrument("Violin II", "G3", "D7", "C4", "C6", "C4", "A6", Instrument.VIOLIN2, Instrument.STRINGS));
		instruments.add(new Instrument("Viola", "C3", "E6", "C3", "C5", "C3", "A5", Instrument.VIOLA, Instrument.STRINGS));
		instruments.add(new Instrument("Cello", "C2", "E5", "E2", "E4", "C2", "A4", Instrument.CELLO, Instrument.STRINGS));
		instruments.add(new Instrument("Double Bass", "B0", "D4", "D1", "D3", "C1", "A3", Instrument.DOUBLEBASS, Instrument.STRINGS));
		
		
		return instruments;
	}
	
	public static List<Instrument> getAllWoodwinds() {
		
		List<Instrument> instruments = new ArrayList<Instrument>();
		
		instruments.add(new Instrument("Flute", "B3", "F7", "E4", "E6", "B3", "C7", Instrument.FLUTE, Instrument.WOODWINDS));
		instruments.add(new Instrument("Oboe", "Bb3", "Bb6", "C4", "C6", "Bb3", "E6", Instrument.OBOE, Instrument.WOODWINDS));
		instruments.add(new Instrument("Clarinet", "D3", "A6", "G3", "G5", "D3", "E6", Instrument.CLARINET, Instrument.WOODWINDS));
		instruments.add(new Instrument("Bassoon", "Bb1", "E5", "E2", "E4", "Bb1", "B4", Instrument.BASSOON, Instrument.WOODWINDS));
		
		return instruments;
	}
	
	public static List<Instrument> getAllBrass() {
		
		List<Instrument> instruments = new ArrayList<Instrument>();
		
		instruments.add(new Instrument("Trumpet", "Gb3", "Eb6", "A3", "A5", "Gb3", "A5", Instrument.TRUMPET, Instrument.BRASS));
		instruments.add(new Instrument("Horn", "Ab2", "F5", "D3", "D5", "Ab2", "D5", Instrument.HORN, Instrument.BRASS));
		instruments.add(new Instrument("Trombone", "C2", "Bb4", "E2", "E4", "C2", "E4", Instrument.TROMBONE, Instrument.BRASS));
		instruments.add(new Instrument("Tuba", "A0", "G4", "B1", "B3", "C1", "D4", Instrument.TUBA, Instrument.BRASS));
		
		
		
		return instruments;
	}
	
	
	
	
	
	

}

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		melodyAssign("Snowmad's Island", "Ab4", "Ab5");
		melodyAssign("Angel's Fear", "F5", "A6");
		melodyAssign("Zelda Theme", "F4", "Bb5");
		melodyAssign("My Melody Low", "G3", "D4");
		melodyAssign("My Melody High", "G5", "D6");

		
		

	}
	
	
	public static void melodyAssign(String melodyname, String lowNote, String highNote) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("-- MELODY: " + melodyname);
		System.out.println("------------------------------------------------------");
		
		List<Integer> scoreForEach = new ArrayList<Integer>();
		List<Instrument> allInstr = InstrumentLoader.getAllInstruments();
		
		for (int i = 0; i < allInstr.size(); i++) {
			scoreForEach.add(evaluateMelodyFor(lowNote, highNote, allInstr.get(i)));
			if (scoreForEach.get(i) < 10000) 
				System.out.println(allInstr.get(i).getName() + " Score: " + scoreForEach.get(i));
		}
		
		
	}
	
	public static int evaluateMelodyFor(String lowNote, String highNote, Instrument instrument) {
		
		Byte lowMelody = ByteNoteConverter.parseToByte(lowNote);
		Byte highMelody = ByteNoteConverter.parseToByte(highNote);
		
		// Disallow out of range
		if (lowMelody < instrument.getLowNote() || highMelody > instrument.getHighNote())
			return 10000;
		
		int score = 0;
		
		// 1 Point for every note below optimal range
		if (lowMelody < instrument.getLowBest())
			score += (instrument.getLowBest() - lowMelody);
		
		// 1 Point for every note above optimal range
		if (highMelody > instrument.getHighBest())
			score += (highMelody - instrument.getHighBest());
		
		// 3 Points for every note outside "ok range"
		if (lowMelody < instrument.getLowOptional())
			score += 2 * (instrument.getLowOptional() - lowMelody);
		
		if (highMelody > instrument.getHighOptional())
			score += 2 * (highMelody - instrument.getHighOptional());
		
		return score;
	}
	
	
	

}


public class ByteNoteConverter {

	
	public static byte parseToByte(String noteName) {
		// For now, start at C0
		
		byte toneValue = 0;
		String tone = noteName.substring(0, 1);
		
		
		
		switch (tone) {
			case "C": toneValue = 1; break;
			case "D": toneValue = 3; break;
			case "E": toneValue = 5; break;
			case "F": toneValue = 6; break;
			case "G": toneValue = 8; break;
			case "A": toneValue = 10; break;
			case "B": toneValue = 12; break;
		}
			
		String modOrNumber = noteName.substring(1, 2);
		boolean modified = false;
		int octave;
		
		if (modOrNumber.equals("#")) {
			toneValue++;
			modified = true; }
			
		if (modOrNumber.equals("b")) {
			toneValue--;
			modified = true; }
		
		if (modified)
			octave = Integer.parseInt(noteName.substring(2, 3));
		else
			octave = Integer.parseInt(modOrNumber);
		
		toneValue = (byte) (toneValue + (12 * octave));
		
	//	System.out.println(noteName);
	//	System.out.println(tone);
	//	System.out.println(modOrNumber);
	//	System.out.println(modified);
	//	System.out.println(octave);
	//	System.out.println(toneValue);
		
		
		return toneValue;	
		
	}
	
	public static String parseToString (byte toneValue, boolean sharp) {
		int octave = 0;
		while (toneValue > 12) {
			octave++;
			toneValue -= 12; }
		
		String tone = "";
		
	switch (toneValue) {
		case 0: tone = "Cb"; break; 
		case 1: tone ="C"; break;
		case 2: tone = sharp ? "C#" : "Db"; break;
		case 3: tone ="D"; break;
		case 4: tone = sharp ? "D#" : "Eb"; break;
		case 5: tone ="E"; break;
		case 6: tone ="F"; break;
		case 7: tone = sharp ? "F#" : "Gb"; break;
		case 8: tone ="G"; break;
		case 9: tone = sharp ? "G#" : "Ab"; break;
		case 10: tone ="A"; break;
		case 11: tone = sharp ? "A#" : "Bb"; break;
		case 12: tone ="B"; break;
		}
	
	//System.out.println(toneValue);
	//System.out.println(tone + octave);
	return tone + octave;
	}
}

package base;

public class ApplicationMain {
	
	public ApplicationMain() {
		
		Note note1 = new Note(Tone.C, 4);
		Note note2 = new Note(Tone.G, 4);
		Note note3 = new Note(Tone.E, 4);
		
		System.out.println(note1.toString() + ", " + note2.toString() + ", " + note3.toString());
		
		System.out.println(note1.getShortIntervalTo(note2) + ", " + note2.getShortIntervalTo(note3) + ", " + note1.getShortIntervalTo(note3));
	}

	public static void main(String[] args) {
		new ApplicationMain();

	}

}

package base;

import java.util.List;

import jm.music.data.Phrase;

import notes.Chord;
import notes.Scale;
import notes.ScaleMode;
import notes.Tone;

public class MusicMain {

	
	public MusicMain() {
		new Scale(Tone.C, ScaleMode.MAJOR).printNotes();
		new Scale(Tone.C, ScaleMode.MAJOR).getEquivalentScaleInMode(ScaleMode.MINOR_NATURAL).printNotes();
		new Scale(Tone.A, ScaleMode.MINOR_NATURAL).getEquivalentScaleInMode(ScaleMode.MAJOR).printNotes();
		
		printChordList(new Scale(Tone.C, ScaleMode.MAJOR).getDiatonicChords());
		printChordList(new Scale(Tone.D, ScaleMode.MAJOR).getDiatonicChords());
		printChordList(new Scale(Tone.E, ScaleMode.MAJOR).getDiatonicChords());
		printChordList(new Scale(Tone.A, ScaleMode.MINOR_NATURAL).getDiatonicChords());
		
	}

	public static void main(String[] args) {
		new MusicMain();
	}
	
	private void printChordList(List<Chord> chords) {
		for (Chord chord : chords)
			System.out.print(chord.getChordName() + ", ");
		System.out.println("");
	}

	Phrase testPhrase
	

}

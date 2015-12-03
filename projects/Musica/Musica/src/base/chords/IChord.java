package base.chords;

import java.util.ArrayList;

import base.tone.ITone;

public interface IChord {

	public String getNameFull();
	public String getNameNumeral();
	
	public ITone getRoot();
	public ArrayList<ITone> getAllNotes();
	
	public int getNumberOfTones();
	
}

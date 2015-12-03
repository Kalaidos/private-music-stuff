package notes;

import java.util.ArrayList;
import java.util.List;

public class Scale {

	
	private final List<Tone> tones;	
	private final ScaleMode mode;
	
	public Scale(Tone key, ScaleMode mode) { 
		this.mode = mode;
		this.tones = buildScaleNotes(key, mode);
	}

	private List<Tone> buildScaleNotes(Tone key, ScaleMode mode) {
		List<Tone> scaleNotes = new ArrayList<Tone>();
		scaleNotes.add(key);
		int fullInterval = 0;
		for (int interval : mode.getSteps()) {
			fullInterval += interval;
			if (fullInterval != 12)
				scaleNotes.add(key.getToneInInterval(fullInterval));
		}
		return scaleNotes;
	}
	
	public void printNotes() {
		// Debug only
		System.out.println(tones.toString());
	}
	
	public boolean equals(Scale otherScale) {
		return (this.mode == otherScale.getMode() && this.getKey() == otherScale.getKey());
	}
	
	public boolean equalsTones(Scale otherScale) {
		return (this.tones.containsAll(otherScale.getTones()) && otherScale.getTones().containsAll(this.tones));
	}
	
	public List<Tone> getOverlappingTonesWith(Scale otherScale) {
		List<Tone> overlappingTones = new ArrayList<Tone>();
		for (Tone tone : tones) 
			if (otherScale.getTones().contains(tone))
				overlappingTones.add(tone);
		return overlappingTones;
	}
	
	public Scale getEquivalentScaleInMode(ScaleMode mode) {
		if (mode == this.mode)
			return this;
		
		Scale searchScale = null;
		boolean found = false;
		for (int i = 1; i < 12; i++) {
			searchScale = new Scale(this.getKey().getToneInInterval(i), mode);
			if (searchScale.equalsTones(this)) {
				found = true;
				break;
			}
		}
		if (found)
			return searchScale;
		else
			return null;
	}
	
	public Scale getNextNeighbourInCircleOfFifth() {
		return new Scale(tones.get(0).getToneInInterval(7), mode);
	}
	
	public Scale getLastNeighbourInCircleOfFifth() {
		return new Scale(tones.get(0).getToneInInterval(5), mode);
	}
	
	public String getName() {
		return this.getKey().getName() + " " + this.getMode().getName();
	}
	
	public List<Chord> getDiatonicChords() {
		List<Chord> chords = new ArrayList<Chord>();
		for (int i = 0; i < this.tones.size(); i++)
			chords.add(new Chord(tones.get(i), tones.get((i + 2) % this.tones.size()), tones.get((i + 4) % this.tones.size())));
		return chords;
	}

	public ScaleMode getMode() {return this.mode;}
	public Tone getKey() {return this.tones.get(0);}
	public List<Tone> getTones() {return this.tones;}
}

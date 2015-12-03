package base.tones;

public class Scale {
	
	private final Tone[] tones;
	private final Mode mode;
	
	public Scale (Tone tonic, Mode mode) {
		this.tones = new Tone[mode.getToneCount()];
		this.mode = mode;
		this.tones[0] = tonic;
		for (int i = 1; i < mode.getToneCount(); i++)
			this.tones[i] = tonic.getToneAboveInInterval(mode.getIntervals()[i-1]);
	}
	
	public String getName() { return tones[0].getName() + " " + mode.getName(); }
	
	public String getToneNames() {
		String toneNames = "";
		for (Tone tone : this.tones)
			toneNames = toneNames + tone.getName() + ", ";
		return toneNames;
			
	}
}

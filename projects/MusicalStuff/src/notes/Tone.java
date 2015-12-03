package notes;

public enum Tone {
		
		C(0, "C"),
		Db(1, "C#"),
		D(2, "D"),
		Eb(3, "D#"),
		E(4, "E"),
		F(5, "F"),
		Gb(6, "F#"),
		G(7, "G"),
		Ab(8, "G#"),
		A(9, "A"),
		Bb(10, "A#"),
		B(11, "B");
		
		private final int index;
		private final String name;
		
		private Tone(int index, String name) {
			this.index = index;
			this.name = name;
		}
		
		public Tone getToneInInterval(int interval) {
			return Tone.values()[(interval + index) % 12];
		}
		
		public int getInterval(Tone otherTone) {
			if (otherTone.index >= this.index)
				return otherTone.index - this.index;
			else
				return (otherTone.index - this.index) + 12;
		}
		
		public String getName() {
			return this.name;
		}
}

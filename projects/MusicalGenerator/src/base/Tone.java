package base;

public enum Tone {

	C(0),
	Cs(1),
	Db(1),
	D(2),
	Ds(3),
	Eb(3),
	E(4),
	Fb(4),
	Es(5),
	F(5),
	Fs(6),
	Gb(6),
	G(7),
	Gs(8),
	Ab(8),
	A(9),
	As(10),
	Bb(10),
	B(11),
	Cb(11),
	Bs(0);
	
	private final int value;
	
	Tone(int value) {
		this.value = value;
	}
	
	public int getValue() { return this.value; }
}

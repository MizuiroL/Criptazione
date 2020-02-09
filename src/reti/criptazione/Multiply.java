package reti.criptazione;

public class Multiply implements AlgorithmsFunctions {

	private int n;

	public Multiply(int n) {
		this.n = n;
	}

	@Override
	public char function(char a) {
		int ascii = (int) a;
		ascii = (ascii * n) % 128;

		char b = (char) ascii;

		return b;
	}

}

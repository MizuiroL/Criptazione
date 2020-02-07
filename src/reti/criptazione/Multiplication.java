package reti.criptazione;

public class Multiplication implements AlgorithmsFunctions {

	private int n;

	@Override
	public char function(char a) {
		int ascii = (int) a;
		ascii = (ascii * n)%128;
		
		char b = (char) ascii;
		
		return b;
	}

}

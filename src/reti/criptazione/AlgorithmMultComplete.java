package reti.criptazione;

public class AlgorithmMultComplete extends AlgorithmsCompleteIteration {
	
	private int n;

	public AlgorithmMultComplete(Message M, int n) {
		super (M);
		this.n = n;
	}

	@Override
	public char function(char a) {
		int ascii = (int) a;
		ascii = (ascii * n)%128;
		
		char b = (char) ascii;
		
		return b;
	}

}

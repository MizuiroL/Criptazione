package reti.criptazione;

public class AlgorithmAddComplete extends AlgorithmsCompleteIteration {
	
	private int n;
	
	public AlgorithmAddComplete(Message M, int n) {
		super (M);
		this.n = n;
	}

	@Override
	public char function(char a) {
		int ascii = (int) a;
		ascii = ascii + n;
		
		char b = (char) ascii;
		
		return b;
	}

}

package reti.criptazione;

public class AlgorithmCompleteIteration implements Algorithms {
	
	private Message M;
	
	private AlgorithmsFunctions A;
	
	public AlgorithmCompleteIteration (Message M, AlgorithmsFunctions A) {
		this.M = M;
		
		this.A = A;
	}

	
	@Override
	public Message getMessage() {
		
		return M;
	}
	
@Override
	public void iteration() {
	char array[] = new char [4]; //Inserire l'array con i codici Ascii
		for (int i = 0; i<= array.length; i++) {
			array[i] = A.function(array[i]);
		}

	}

}

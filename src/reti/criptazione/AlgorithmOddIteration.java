package reti.criptazione;

public class AlgorithmOddIteration implements Algorithms {

    private Message M;
	
	private AlgorithmsFunctions A;
	
	public AlgorithmOddIteration (Message M, AlgorithmsFunctions A) {
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
		for (int i = 0; i<= array.length; i = i + 2) {
			array[i] = A.function(array[i]);
		}

	}

}

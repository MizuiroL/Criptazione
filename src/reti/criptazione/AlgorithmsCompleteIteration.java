package reti.criptazione;

public abstract class AlgorithmsCompleteIteration implements Algorithms {
	
	private Message M;
	
	public AlgorithmsCompleteIteration (Message M) {
		this.M = M;
	}

	
	@Override
	public Message getMessage() {
		
		return M;
	}
	
@Override
	public void iteration() {
	char array[] = new char [4]; //Inserire l'array con i codici Ascii
		for (int i = 0; i<= array.length; i++) {
			array[i] = function(array[i]);
		}

	}

@Override	
	public abstract char function(char a);

}

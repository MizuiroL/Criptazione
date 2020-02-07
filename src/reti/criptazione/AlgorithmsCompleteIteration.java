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
		

	}

@Override	
	public abstract char function(char a);

}

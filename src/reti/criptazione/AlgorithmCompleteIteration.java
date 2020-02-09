package reti.criptazione;

public class AlgorithmCompleteIteration implements Algorithms {

	private Message M;

	private AlgorithmsFunctions A;

	public AlgorithmCompleteIteration(Message M, AlgorithmsFunctions A) {
		this.M = M;

		this.A = A;
	}

	@Override
	public Message getMessage() {

		return M;
	}

	@Override
	public void iteration() {
		M.stringToAscii();
		for (int i = 0; i < M.getListMessage().length; i++) {
			M.getListMessage()[i] = A.function(M.getListMessage()[i]);
		}

	}

}

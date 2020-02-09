package reti.criptazione;

public class AlgotithmEvenIteration implements Algorithms {

	private Message M;

	private AlgorithmsFunctions A;

	public AlgotithmEvenIteration(Message M, AlgorithmsFunctions A) {
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
		for (int i = 1; i < M.getListMessage().length; i = i + 2) {
			M.getListMessage()[i] = A.function(M.getListMessage()[i]);
		}

	}
}

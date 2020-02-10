package reti.criptazione;

public abstract class AlgorithmsWithFunction implements Algorithms {

	private Message M; // Private attribute from the class Message

	private AlgorithmsFunctions funct; /*
										 * Attribute of the AlgorithmFunctions class containing the function to be
										 * applied to the message
										 */

	public AlgorithmsWithFunction(Message M, AlgorithmsFunctions funct) {
		// class constructor
		this.M = M;
		this.funct = funct;
	}

/////////////////////Getters//////////////////////////
	@Override
	public Message getMessage() {

		return M;
	}

	public AlgorithmsFunctions getFunct() {
		return funct;
	}

//Setters are not needed because class attributes should not be changed
////////////////////////////////////////////////////////////////////////

	@Override
	public abstract void iteration(); // Abstract method that have to be implemented in concrete classes

}

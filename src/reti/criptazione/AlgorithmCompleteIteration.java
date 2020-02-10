package reti.criptazione;

public class AlgorithmCompleteIteration extends AlgorithmsWithFunction {

	// Extends the abstract class AlgoritmsWithFunction

	public AlgorithmCompleteIteration(Message M, AlgorithmsFunctions funct) {
		// Class constructor
		super(M, funct); // Invokes the constructor of the extended abstract class
	}

	@Override
	public void iteration() {
		Message M = super.getMessage(); // Invokes the methods of the super class
		M.stringToAscii(); // Invokes the Message class method to get the char array
		for (int i = 0; i < M.getListMessage().length; i++) {
			M.getListMessage()[i] = super.getFunct().function(M.getListMessage()[i]); // Apply the function to each char

		}

	}

}

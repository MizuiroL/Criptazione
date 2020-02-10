package reti.criptazione;

public class AlgorithmEvenIteration extends AlgorithmsWithFunction {

	// Extends the abstract class AlgoritmsWithFunction

	public AlgorithmEvenIteration(Message M, AlgorithmsFunctions funct) {
		// Class constructor
		super(M, funct); // Invokes the constructor of the extended abstract class
	}

	@Override
	public void iteration() {
		Message M = super.getMessage(); // Invokes the methods of the super class
		M.stringToAscii(); // Invokes the Message class method to get the char array
		for (int i = 1; i < M.getListMessage().length; i = i + 2) {
			M.getListMessage()[i] = super.getFunct().function(M.getListMessage()[i]); // Apply the function to char in
																						// even positions
		}

	}
}

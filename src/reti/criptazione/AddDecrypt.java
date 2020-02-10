package reti.criptazione;

public class AddDecrypt implements AlgorithmsFunctions {

	// Concrete class that implements the interface AlgorithmsFunctions

	@Override
	public char function(char a) {
		// Method implemented by the interface
		int ascii = (int) a; // Cast to transform a character into its Ascii code
		ascii = (120 + ascii) % 128;/*
									 * Since the operation is in module 128, then adding 120 to the original code is
									 * like removing 8
									 */
		char b = (char) ascii; // The ascii code is transformed back into a char
		return b;
	}

}

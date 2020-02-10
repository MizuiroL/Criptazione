package reti.criptazione;

public class Add implements AlgorithmsFunctions {

	// Concrete class that implements the interface AlgorithmsFunctions

	private int n; // Int attribute to indicate the number to be added to the ascii code of the
					// characters

	public Add(int n) {
		// Class constructor
		this.n = n;
	}

	@Override
	public char function(char a) {
		// Method implemented by the interface
		int ascii = (int) a; // Cast to transform a character into its Ascii code
		ascii = (ascii + n) % 128; /*
									 * Carry out the calculations to the character There are 128 codes in the Java
									 * ascii table, so a module 128 operation is performed
									 */
		char b = (char) ascii; // The ascii code is transformed back into a char
		return b;
	}

}

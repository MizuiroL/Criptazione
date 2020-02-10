package reti.criptazione;

public interface Algorithms {

	/*
	 * Interface containing two methods common to all algorithms useful for creating
	 * a further level of abstraction and for having greater extensibility of the
	 * code.
	 */

	public Message getMessage(); // Getter for the object who contain the input message

	public void iteration(); // Method for iterating, to be implemented in concrete classes

}

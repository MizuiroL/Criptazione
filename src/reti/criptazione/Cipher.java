package reti.criptazione;

import java.util.Scanner;

public class Cipher {

	// Class attributes

	private static Scanner scan = new Scanner(System.in); // To get the user input
	private AlgorithmsFunctions function; // Function used to create the object A (from Algorithms class)
	private Algorithms A; // Algorithms to apply to the message
	private Message M = new Message(); // Class used for read the user message

	public static void main(String[] args) {
		Cipher C = new Cipher();
		C.password(); // Calls the method for checking the key
	}

	public void password() {
		// This method verifies the correct insertion of the key
		System.out.println("Enter the password:");
		String in = scan.nextLine(); // Get user input
		if (in.equals("Papaya")) {
			start();

		} else {
			System.out.println("The key is incorrect!");
			password(); // Allows the user to make other attempts without having to rerun de program

		}
	}

	public void start() {
		System.out.println("Enter the message to be encrypted:");
		String in = scan.nextLine(); // Get user input
		M.setMessage(in); // Insert the input message in the "Message" class
		encryptOrDecrypt(); // Select if we want to encrypt or decrypt the message
		A = new AlgorithmCompleteIteration(M, function); // Create the object that allows to apply the algorithm
		A.iteration(); // Apply the algorithm
		System.out.println("The decrypted message is:");
		System.out.print(M.getListMessage()); // Print the encrypted message
		wantToContinue();

	}

	public void encryptOrDecrypt() {
		System.out.println("Do you want to encrypt or decrypt the message?");
		String in = scan.nextLine(); // Get user input
		// Series of "if" that allows the user to select the algorithm
		if (in.equalsIgnoreCase("encrypt")) {
			function = new Add(); // Create the object that allows to apply the cryption function
		} else if (in.equalsIgnoreCase("decrypt")) {
			function = new AddDecrypt(); // Create the object that allows to apply the decryption function
		} else {
			System.out.println("You need to enter 'encrypt' or 'decrypt' to continue:");
			/*
			 * The immediately preceding line of code send a message to the user to make him
			 * understand that the input he has entered is incorrect
			 */
			encryptOrDecrypt(); /*
								 * Allows the user to enter the algorithm he prefers, without having to restart
								 * the program
								 */
		}
	}

	public void wantToContinue() {
		// Method that allows the user to decide if he wants to continue using the
		// program
		System.out.println("\nDo you want to continue encrypting your messages?");
		String in = scan.nextLine(); // Get user input
		if (in.equalsIgnoreCase("Yes")) {
			start(); // Allows the user to keep using the cipher, without having to restart the
						// program
		} else {
			System.exit(0); // End the program
		}
	}

}

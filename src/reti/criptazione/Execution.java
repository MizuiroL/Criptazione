package reti.criptazione;

import java.util.Scanner;

public class Execution {

	// Class attributes

	private static Scanner scan = new Scanner(System.in); // To get the user input
	private AlgorithmsFunctions function; // Function used to create the object A (from Algorithms class)
	private Algorithms A; // Algorithms to apply to the message
	private Message M = new Message(); // Class used for read the user message

	public static void main(String[] args) {
		Execution E = new Execution(); // Create an Execution object to start the program
		E.start(); // Method from the class "Execution" that start the program

	}

	public void start() {

		System.out.println("Enter the message to be encrypted:");
		String in = scan.nextLine(); // Get user input
		M.setMessage(in); // Insert the input message in the "Message" class
		selectFunction(); // Method to select the function to be used for the Algorithm
		selectIteration(); // Method to select the iteration to be used for the Algorithm
		A.iteration(); // Apply the algorithm
		System.out.println("The decrypted message is:");
		System.out.print(M.getListMessage()); // Print the encrypted message

	}

	public void selectIteration() {
		System.out.println("Select the iteration to apply to the message (select info for more information):");
		String li = scan.next(); // Get user input
		if (li.equalsIgnoreCase("Complete")) { // Series of "if" that allows the user to select the iteration to be
												// applied to the algorithm
			A = new AlgorithmCompleteIteration(M, function); // Create the object that allows to apply the algorithm
		} else if (li.equalsIgnoreCase("Even")) {
			A = new AlgorithmEvenIteration(M, function); // Create the object that allows to apply the algorithm
		} else if (li.equalsIgnoreCase("Odd")) {
			A = new AlgorithmOddIteration(M, function); // Create the object that allows to apply the algorithm
		} else if (li.equalsIgnoreCase("info")) {
			infoIteration(); // Invoke a method that contains useful information for the user
		} else {
			System.out.println("The iteration you have entered is not present in the encryption system.");
			infoIteration(); // Invoke a method that contains useful information for the user
		}
	}

	public void infoIteration() {
//This method contains useful information for the user to make choices dynamically on the algorithm to be applied
		System.out.println("You can enter one of the following commands:");
		System.out.println(">Complete -> Apply the function to all characters of the message");
		System.out.println(">Even -> Apply the function only to characters in even positions");
		System.out.println(">Odd -> Apply the function only to characters in odd positions");
		selectIteration(); /*
							 * Allows the user to enter the iteration rules he prefers, without having to
							 * restart the program
							 */
	}

	public void selectFunction() { // Allows the user to select the function to be
									// applied to the algorithm
		System.out.println("Select the function to apply to the message (select info for more information):");
		String in = scan.nextLine();
		in.toLowerCase();
		int input;
		switch (in) {
		case "add":
			System.out.println("Select the number (integer) to be added:");
			input = scan.nextInt(); // Get the user input
			function = new Add(input); // Create the object that allows to apply a function to the algorithm
			break;
		case "multiply":
			System.out.println("Select the number (integer) to be multiply:");
			input = scan.nextInt(); // Get the user input
			function = new Multiply(input); // Create the object that allows to apply a function to the algorithm
			break;
		case "info":
			info(); // Invoke a method that contains useful information for the user
			break;
		default:
			System.out.println("The function you have entered is not present in the encryption system.");
			/*
			 * The immediately preceding line of code send a message to the user to make him
			 * understand that the input he has entered is incorrect
			 */
			info(); // Invoke a method that contains useful information for the user
		}
	}

	public void info() {
		// This method contains useful information for the user to make choices
		// dynamically on the algorithm to be applied
		System.out.println("You can enter one of the following commands:");
		System.out.println(">Add -> Increase the digits of the message by n places");
		System.out.println(">Multiply -> Multiply the Ascii code by the digits of the message of n");
		selectFunction();/*
							 * Allows the user to enter the function rules he prefers, without having to
							 * restart the program
							 */

	}
}

package reti.criptazione;

import java.util.Scanner;

public class Esecuzione {

	// private Structure str = Structure.generateStructure();
	private static Scanner scan;
	private int n;
	private AlgorithmsFunctions function;
	private Algorithms A;
	private Message M = new Message();

	public static void main(String[] args) {
		// Structure s = Structure.generateStructure();
		Esecuzione E = new Esecuzione();
		E.start();

	}

	public void start() {

		System.out.println("Inserisci il messaggio da criptare:");
		scan = new Scanner(System.in);
		String in = scan.nextLine();
		M.setMessage(in);
		selectFunction();
		selectIteration();
		A.iteration();
		System.out.print(M.getListMessage());

	}

public void selectIteration() {
	System.out.println("Select the iteration to apply to the message (select info for more information):");
	String in = scan.nextLine();
	if (in.equalsIgnoreCase("Complete")){
		A = new AlgorithmCompleteIteration(M, function);
	}else if(in.equalsIgnoreCase("Even")) {
		A = new AlgorithmEvenIteration(M, function);
	}else if (in.equalsIgnoreCase("Odd")) {
		A = new AlgorithmOddIteration(M, function);
	}else if (in.equalsIgnoreCase("info")) {
		infoIteration();
	}else {
		System.out.println("The iteration you have entered is not present in the encryption system.");
		infoIteration();
	}
}

public void infoIteration() {
	System.out.println("You can enter one of the following commands:");
	System.out.println(">Complete -> Apply the function to all characters of the message");
	System.out.println(">Even -> Apply the function only to characters in even positions");
	System.out.println(">Odd -> Apply the function only to characters in odd positions");
	selectIteration();
}

	public void selectFunction() {
		System.out.println("Select the function to apply to the message (select info for more information):");
		String in = scan.nextLine();
		if (in.equalsIgnoreCase("Add")) {
			System.out.println("Select the number (integer) to be added:");
			int input = scan.nextInt();
			n = input;
			function = new Add(n);
		} else if (in.equalsIgnoreCase("Multiply")) {
			System.out.println("Select the number (integer) to be multiply:");
			int input = scan.nextInt();
			n = input;
			function = new Multiply(n);
		} else if (in.equalsIgnoreCase("info")) {
			info();
		} else {
			System.out.println("The function you have entered is not present in the encryption system.");
			info();
		}
	}
	
public void info() {
		System.out.println("You can enter one of the following commands:");
		System.out.println(">Add -> Increase the digits of the message by n places");
		System.out.println(">Multiply -> Multiply the Ascii code by the digits of the message of n");
		selectFunction();

	}
}

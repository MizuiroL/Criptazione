package reti.criptazione;

import java.util.Scanner;

public class Esecuzione {

	//private Structure str = Structure.generateStructure();
	private static Scanner scan;
	private int n;
	private AlgorithmsFunctions function;

	public static void main(String[] args) {
		//Structure s = Structure.generateStructure();
		Esecuzione E = new Esecuzione();
		E.start();
	    
	}
	
	public void start() {
		
		System.out.println("Inserisci il messaggio da criptare:");
	    scan = new Scanner(System.in);
	    String in = scan.nextLine();
	    Message M = new Message();
	    M.setMessage(in);
	    System.out.println("Select the function to apply to the message:");
	    in = scan.nextLine();
	    selectFunction(in);
	    AlgorithmsFunctions add = new Add(4);
	    Algorithms A = new AlgotithmEvenIteration(M, add);
	    A.iteration();
	    System.out.print(M.getListMessage());
		
	}
	public void info() {
		System.out.println("You can enter one of the following commands:");
	}

	public void selectFunction(String in) {
		if(in.equalsIgnoreCase("Add")) {
			System.out.println("Select the number (integer) to be added:");
			int input = scan.nextInt();
			n = input;
			function = new Add(n);
		}else if (in.equalsIgnoreCase("Multiply")) {
			System.out.println("Select the number (integer) to be multiply:");
			int input = scan.nextInt();
			n = input;
			function = new Multiply(n);
		}else if(in.equalsIgnoreCase("info")) {
			info();
		}else {
			System.out.println("The function you have entered is not present in the encryption system.");
			info();
			selectFunction(in);
		}
	}
}

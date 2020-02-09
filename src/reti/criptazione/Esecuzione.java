package reti.criptazione;

import java.util.Scanner;



public class Esecuzione {

	//private Structure str = Structure.generateStructure();
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		//Structure s = Structure.generateStructure();
	    System.out.println("Inserisci il messaggio da criptare:");
	    scan = new Scanner(System.in);
	    String in = scan.nextLine();
	    Message M = new Message();
	    M.setMessage(in);
	    AlgorithmsFunctions add = new Add(4);
	    Algorithms A = new AlgotithmEvenIteration(M, add);
	    A.iteration();
	    System.out.print(M.getListMessage());
	}

	
}

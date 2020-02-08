package reti.criptazione;

import java.util.Scanner;



public class Esecuzione {

	//private Structure str = Structure.generateStructure();
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		//Structure s = Structure.generateStructure();
	    System.out.print("Inserisci il messaggio da criptare:");
	    scan = new Scanner(System.in);
	    String in = scan.nextLine();
	    Message M = new Message();
	    M.setMessage(in);
	    System.out.print(M.getMessage());
	}

	
}

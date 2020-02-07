package reti.criptazione;

public class Esecuzione {

	public static void main(String[] args) {
		char character = 'a';    
		int ascii = (int) character;
		
		System.out.print(ascii);
		
		System.out.print('\n');
		
		ascii = ascii + 4;
		
		char gigio = (char) ascii;
		
		System.out.print(gigio);

	}

}

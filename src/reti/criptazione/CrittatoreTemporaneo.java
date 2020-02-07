package reti.criptazione;

import java.util.Random;
// Modifica
public class CrittatoreTemporaneo {
	public static String firstEncryption(String original, int n) {
		int[] asciiArray = stringToAscii(original);
		for (int i=0; i<asciiArray.length; i++) {
			asciiArray[i] = (asciiArray[i] + n) % 128;
			System.out.println(asciiArray[i]);
		}
		return asciiToString(asciiArray);
	}

	public static int[] stringToAscii(String original) {
		int[] asciiArray = new int[original.length()];
		for (int i = 0; i < original.length(); i++) {
			asciiArray[i] = (int) original.charAt(i);
		}
		return asciiArray;
	}
	
	public static String asciiToString(int[] array) {
		String result = "";
		for(int i = 0; i<array.length; i++) {
			result += (char) array[i];
		}
		return result;
	}

	public static int generateKey() {
		return new Random().nextInt();
	}
	
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(" "+i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(stringToAscii("ciao"));
		System.out.println(firstEncryption("ciao", 3));
	}
}

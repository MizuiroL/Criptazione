package reti.criptazione;

public class VigenereTemporaneo {
	private static String vigenere(String plaintext, String keyword) {
		plaintext = plaintext.toUpperCase().replaceAll(" ", "");
		keyword = keyword.toUpperCase().replaceAll(" ", "");
		return vigenereEncryption(plaintext, keyword);
	}

	private static String vigenereEncryption(String plaintext, String keyword) {
		String cryptedtext = "";
		for (int i = 0; i < plaintext.length(); i++) {
			cryptedtext += (char) ((plaintext.charAt(i) + keyword.charAt(i % keyword.length())) % 26 + 'A');
		}
		return cryptedtext;
	}

	public static void main(String[] args) {
		System.out.println(vigenere("rapporto immediato", "verme"));
	}
}

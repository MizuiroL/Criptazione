package reti.criptazione;

public class Message {

	private String message; // Attribute "message" to store the message to encrypt

	private char[] listMessage; // Array used to store the characters of the message in char format

/////////////////Getters and Setters////////////////////
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public char[] getListMessage() {
		return listMessage;
	}
	/*
	 * The class don't have to implements the setter for the attribute listMessage,
	 * because it don't have to be modified.
	 */
/////////////////////////////////////////////////////////

	public void stringToAscii() {
		listMessage = new char[message.length()]; // Set the private attribute "listMessage" using the length of the
													// String "message"
		for (int i = 0; i < message.length(); i++) {
			listMessage[i] = message.charAt(i); // Transform each character in the string into a char element and insert
												// it into the array
		}
	}

}

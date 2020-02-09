package reti.criptazione;

public class Message {

	private String message;

	private char[] listMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public char[] getListMessage() {
		return listMessage;
	}
	
	public void stringToAscii() {
		listMessage = new char[message.length()];
		for (int i = 0; i < message.length(); i++) {
			listMessage[i] = message.charAt(i);
		}
	}

}

package reti.structure;

import reti.criptazione.*;
import reti.structure.Structure;

public class Structure {

	private String content;
	private Message message;
	private static Structure instance;
	

	
	private Structure() {
	}

	public static Structure generateStructure() {
		if (instance == null) {
			instance = new Structure();
		}
		return instance;

	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Message getMessage() {
		return message;
	}
	
	public void updateMessage (String a) {
		message.setMessage(a);
	}

}

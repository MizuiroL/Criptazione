package reti.structure;

import reti.structure.Structure;

public class StringController {

	private final Structure str = Structure.generateStructure();

	public Structure getStr() {
		return str;
	}
	
	public void update(String a) {
		str.getMessage().setMessage(a);
	}
}

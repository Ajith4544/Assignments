package assignment4;

import org.springframework.beans.factory.annotation.Autowired;

public class a2config {
	
	@Autowired
	private a2 an2;
	
	/*public void TextEditor() {
		System.out.println("@autowird");
	}*/
	
	public a2 get() {
		return an2;
	}
	
	
}

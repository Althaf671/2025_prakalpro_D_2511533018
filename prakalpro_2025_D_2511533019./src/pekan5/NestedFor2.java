package pekan5;

import shared.MyLogger;

public class NestedFor2 {

	static MyLogger Ada = new MyLogger();
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				Ada.Text_IO_Put(i + j + " ");
			}
			Ada.Text_IO_Put_Line("");
		}

	}
}

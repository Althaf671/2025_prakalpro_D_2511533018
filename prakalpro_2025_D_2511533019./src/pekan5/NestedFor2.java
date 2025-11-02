package pekan5;

import shared.MyLogger;

public class NestedFor2 {

	static MyLogger ada = new MyLogger();
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				ada.Text_IO_Put(i + j + " ");
			}
			ada.Text_IO_Put_Line("");
		}

	}

}

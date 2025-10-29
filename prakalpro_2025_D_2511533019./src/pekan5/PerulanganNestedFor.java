package pekan5;

import shared.MyLogger;

public class PerulanganNestedFor {

	static MyLogger put = new MyLogger();
	
	public static void main(String[] args) {
		
		for(int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
				put.defaultLog(".");
			}
			put.defaultLog(line);
			put.log("");
		}

	}

}

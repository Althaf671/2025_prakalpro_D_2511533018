package pekan5;

import shared.MyLogger;

public class PerulanganNestedFor1 {

	static MyLogger tampilkan = new MyLogger();
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				tampilkan.defaultLog("*");	
			}
			tampilkan.log("");
		}
		
	}

}

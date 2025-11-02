package pekan5;

import shared.MyLogger;

public class PerulanganFor1 {
	
	static MyLogger print = new MyLogger();

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			print.log("Hasil: " + i);
		}
		
	}

}

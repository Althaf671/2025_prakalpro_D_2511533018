package pekan5;

import shared.MyLogger;

public class PerulanganFor2 {

	static MyLogger tampilkan = new MyLogger();
	
	public static void main(String[] args) {
		
		tampilkan.log("Perulangan for 2");
		
		for (int i = 1; i <= 10; i++) {
			tampilkan.log(i + " ");
		}

	}

}

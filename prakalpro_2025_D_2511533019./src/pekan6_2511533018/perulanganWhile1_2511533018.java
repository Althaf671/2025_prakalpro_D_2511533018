package pekan6_2511533018;

import java.util.Scanner;

public class perulanganWhile1_2511533018 {

	public static void main(String[] args) {
		
		int counter = 0;
		String jawab;
		boolean running = true;
		Scanner scan = new Scanner(System.in);
		
		while (running) {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.print("Apakah lanjut (ya/tidak?)");
			jawab = scan.nextLine();
			
			// Cek jawab = tidak, perulangan berhenti.
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

	}

}

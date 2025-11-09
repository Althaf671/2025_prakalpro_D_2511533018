package pekan6_2511533018;

import java.util.Scanner;

public class SentinelLoop_2511533018 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number = 12;
		
		while (number != 0) {
			System.out.print("Masukan angka (0 untuk exit)");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("Totalnya adalah " + sum);
		console.close();
	}

}

package prakalpro_2025_D_2511533018_pckg;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program pertama
		/* komentar
		 * dua baris atau lebih
		 * pertemuan 1 praktikum alpro
		 * */

		System.out.println("Hello World");
		System.out.println();
		System.out.println("Program ini menghasilkan");
		System.out.println("Empat baris output");
		System.out.println("/ \\// \\\\ /// \\\\ ");
		System.out.println("This"+"program prints a\n"+
						   "quote from Gettysburg Address.");
		
		
		
		
		// Login
		var user = "Althaf";
		int pwd = 123;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input username: ");
		String username = scanner.nextLine();
		
		if (username == user) {
			System.out.println("Correct username");
		} else {
			System.out.println("Incorrect username");
		};
		
		System.out.print("Input password: ");
		int password = scanner.nextInt();
		
		if (password == pwd) {
			System.out.println("Password correct");
			System.out.println("Hello" + username);
		} else {
			System.out.println("Invalid password");
		}; 
		
		scanner.close();
	}
}

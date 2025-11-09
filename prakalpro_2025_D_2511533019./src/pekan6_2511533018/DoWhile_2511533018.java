package pekan6_2511533018;

import java.util.Scanner;

public class DoWhile_2511533018 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String phrase;
		
		do {
			System.out.print("Input password ");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
		console.close();
	}

}

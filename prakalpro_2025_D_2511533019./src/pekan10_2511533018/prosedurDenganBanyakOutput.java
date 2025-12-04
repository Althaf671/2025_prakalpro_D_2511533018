package pekan10_2511533018;

import java.util.Scanner;

public class prosedurDenganBanyakOutput {
	static int a, b, c;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int v = input.nextInt();
		programBanyakOutput(v);
		System.out.println(a + " - " + b + " - " + c);
		
		input.close();
	}
	
	private static void programBanyakOutput(int v) {
		a = v * 5;
		b = v % 2;
		c = v + 5;
	}

}

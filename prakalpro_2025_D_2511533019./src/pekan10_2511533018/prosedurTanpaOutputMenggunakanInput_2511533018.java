package pekan10_2511533018;

import java.util.Scanner;

public class prosedurTanpaOutputMenggunakanInput_2511533018 {
	static int b;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		tanpaOutputDenganInput(a);
		
		input.close();
	}
	
	public static void tanpaOutputDenganInput(int a) {
		b = a * 5;
		System.out.println(b);
	}

}

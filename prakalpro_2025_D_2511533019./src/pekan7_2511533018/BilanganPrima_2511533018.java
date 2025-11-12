package pekan7_2511533018;

import java.util.Scanner;

public class BilanganPrima_2511533018 {
	
	
	public static boolean isPrime(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
			System.out.println("count " + i);
		}
		return (factors == 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input nilai n = ");
		
		int a = input.nextInt();
		
		if (isPrime(a)) {
			System.out.println(a + " bilangan prima");
		} else {
			System.out.println(a + " bukan bilangan prima");
		}
		input.close();
	}
	
}

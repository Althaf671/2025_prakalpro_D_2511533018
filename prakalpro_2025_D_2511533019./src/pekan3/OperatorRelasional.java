package pekan3;

import java.util.Scanner;

public class OperatorRelasional {
	
	static MyLogger console = new MyLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		console.log("Operasi Relasional");
		
		// deklrasi variabel
		int A1;
		int A2;
		boolean hasil;
		
		// Input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		
		hasil = A1 > A2;
		console.log("A1 > A2 = " + hasil);
		
		hasil = A1 < A2;
		console.log("A1 < A2 = " + hasil);
		
		hasil = A1 >= A2;
		console.log("A1 >= A2 = " + hasil);
		
		hasil = A1 <= A2;
		console.log("A1 <= A2 = " + hasil);
		
		hasil = A1 == A2;
		console.log("A1 == A2 = " + hasil);
		
		hasil = A1 != A2;
		console.log("A1 != A2 = " + hasil);
		

	}

}

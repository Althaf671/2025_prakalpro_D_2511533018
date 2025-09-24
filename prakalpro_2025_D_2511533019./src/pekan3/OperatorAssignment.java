package pekan3;

import java.util.Scanner;

public class OperatorAssignment {
	
	static MyLogger console = new MyLogger();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1;
		int A2;
		
		Scanner keyboard = new Scanner(System.in);
		A1 = keyboard.nextInt();
		System.out.print("Input angka ke-1: " + A1);
		
		A2 = keyboard.nextInt();
		System.out.print("Input angka ke-2: " + A2);
		keyboard.close();
		
		console.log("Assignment penambahan");
		A1 += A2;
		console.log("Penambahan: " + A1);
		
		console.log("Assingment pengurangan");
		A1 -= A2;
		console.log("Pengurangan: " + A1);
		
		console.log("Assignment perkalian");
		A1 *= A2;
		console.log("Perkalian: " + A1);
		
		console.log("Assignment hasil bagi");
		A1 /= A2;
		console.log("Pembagian: " + A1);
		
		console.log("Assigement sisa bagi");
		A1 %= A2;
		console.log("Sisa bagi: " + A1);
	}

}

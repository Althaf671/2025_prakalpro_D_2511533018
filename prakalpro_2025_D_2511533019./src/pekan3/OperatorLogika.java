package pekan3;

import java.util.Scanner;

import shared.MyLogger;

public class OperatorLogika {

	static MyLogger console = new MyLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean A1;
		boolean A2;
		boolean c;
		
		console.log("Operator Logika - true or false");
		
		// Input
		console.log("Input nilai boolean ke-1");
		Scanner keyboard = new Scanner(System.in);
		A1 = keyboard.nextBoolean();
		
		console.log("Input nilai boolean ke-2");
		A2 = keyboard.nextBoolean();
		keyboard.close();
		
		console.log("A1 =" + A1);
		console.log("A2 = " + A2);
		
		console.log("Konjungsi" );
		c = A1 && A2;
		console.log("true and false = " + c);
		
		console.log("Disjungsi" );
		c = A1 || A2;
		console.log("true or false = " + c);
		
		console.log("Negasi" );
		c = !A1;
		console.log("Bukan true = " + c);
		

	}

}

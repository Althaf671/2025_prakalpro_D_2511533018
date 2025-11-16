package pekan7_2511533018;

import java.util.Scanner;

public class String2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nama depan: ");
		String firstName = input.nextLine();
		
		System.out.print("Nama belakang: ");
		String lastName = input.nextLine();
		
		String txt1 = "Dosen\"Intelektual\"Kampus";
		System.out.println("Nama lengkap: " + firstName + " " + lastName);
		System.out.println("Nama lengkap: " + firstName.concat(lastName));
		System.out.println(txt1);
		
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("x + y = " + z);
		
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println("String a + String b = " + c);
		
		String v = a + y;
		System.out.println("String a + Integer y = " + v);
		
		input.close();

	}

}

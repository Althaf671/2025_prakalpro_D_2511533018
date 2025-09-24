package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {
	
	static MyLogger logger = new MyLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1;
		int A2;
		int hasil;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		logger.log("Angka: " + A1);
		
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		logger.log("Angka: " + A2);
		
		keyboard.close();
		
		logger.log("Operator penjumlahan");
		hasil = A1 + A2;
		logger.log("Hasil penjumlahan: " + hasil);
		
		logger.log("Operator pengurangan");
		hasil = A1 - A2;
		logger.log("Hasil pengurangan: " + hasil);
		
		logger.log("Operator perkalian");
		hasil = A1 * A2;
		logger.log("Hasil perkalian: " + hasil);
		
		logger.log("Operator pembagian");
		hasil = A1 / A2;
		logger.log("Hasil pengurangan: " + hasil);
		
		logger.log("Operator sisa bagi");
		hasil = A1 % A2;
		logger.log("Sisa: " + hasil);
		
		
	}


}

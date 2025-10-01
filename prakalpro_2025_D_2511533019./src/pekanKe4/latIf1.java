package pekanKe4;

import java.util.Scanner;

import shared.MyLogger;
import shared.MyScanner;

public class latIf1 {
	
	static MyLogger tampilkan = new MyLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tampilkan.log("Memulai program");
		
		double IPK;
		
		MyScanner input = new MyScanner(); 
		
		IPK = input.nextDouble("Masukan IPK");
		
		input.closeScanner();
		

		if (IPK > 2.75) {
			tampilkan.log("Anda Lulus sangat memuaskan dengan IPK " + IPK);
		} else {
			tampilkan.log("Anda tidak lulus");
		}
		

	}

}


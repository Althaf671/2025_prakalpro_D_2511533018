package pekanKe4;

import shared.MyLogger;
import shared.MyScanner;

public class NestedIfNilai {
	
	static MyLogger tampilkan = new MyLogger();

	public static void main(String[] args) {
		tampilkan.log("===== Memulai Program =====");

		int nilai;
		
		// Input
		MyScanner input = new MyScanner();
		
		nilai = input.nextInt("Masukan nilai angka");
		input.nextLine();
		
		input.closeScanner();
		
		if (nilai >= 81) {
			tampilkan.log("A");
		} else if (nilai >= 70) {
			tampilkan.log("B");
		} else if (nilai  >= 60) {
			tampilkan.log("C");
		} else if (nilai >= 50) {
			tampilkan.log("D");
		} else {
			tampilkan.log("E");
		}
		
		tampilkan.log("===== Program Berakhir =====");
	}

}

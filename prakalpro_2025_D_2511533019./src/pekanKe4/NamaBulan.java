package pekanKe4;

import shared.MyLogger;
import shared.MyScanner;

public class NamaBulan {
	
	static MyLogger tampilkan = new MyLogger();

	public static void main(String[] args) {
		tampilkan.log("====== Memulai Program =====");
	
		
		// Input
		MyScanner ketik = new MyScanner();
		int bulan = ketik.nextInt("Masukan angka bulan (1-12)");
		
		// Switch case
		switch (bulan) {
			case 1:
				tampilkan.log("Januari");
				break;
			case 2:
				tampilkan.log("Februari");
				break;
			case 3:
				tampilkan.log("Maret");
				break;
			case 4:
				tampilkan.log("April");
				break;
			case 5:
				tampilkan.log("Mei");
				break;
			case 6:
				tampilkan.log("Juni");
				break;
			case 7:
				tampilkan.log("Juli");
				break;
			case 8:
				tampilkan.log("Agustus");		
				break;
			case 9:
				tampilkan.log("September");	
				break;
			case 10:
				tampilkan.log("Oktober");	
				break;
			case 11:
				tampilkan.log("Novemeber");	
				break;
			case 12:
				tampilkan.log("Desember");	
				break;	
			default:
				tampilkan.log("Angka tidak valid");
		}
		
		ketik.closeScanner();
		

	}

}

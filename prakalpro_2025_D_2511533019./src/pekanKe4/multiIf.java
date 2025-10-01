package pekanKe4;

import shared.MyLogger;
import shared.MyScanner;

public class multiIf {
	
	static MyLogger tampilkan = new MyLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tampilkan.log("===== Memulai Program =====");
		
		int umur;
		char sim;
		
		// Input umur
		MyScanner input = new MyScanner();
		
		umur = input.nextInt("Masukan umur");
		input.nextLine();
		sim = input.nextChar("Apakah anda sudah punya SIM C");
		input.nextLine();
		
		input.closeScanner();
		
		if ((umur >= 17) && (sim == 'y')) {
			tampilkan.log("Anda sudah dewasa dan boleh bawa motor");
		}
		if ((umur >= 17) && (sim !='y')) {
			tampilkan.log("Anda sudah dewasa tetapi tidak boleh bawa motor");
		}
		if ((umur < 17) && (sim == 'y')) {
			tampilkan.log("Anda belum cukup umur untuk punya SIM");
		}
		if ((umur < 17) && (sim != 'y')) {
			tampilkan.log("Anda belum cukup umur untuk membawa motor");
		}
		
		tampilkan.log("===== Program Berakhir =====");
	}

}

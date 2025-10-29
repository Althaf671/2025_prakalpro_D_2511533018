package pekan5;

import shared.MyLogger;
import shared.MyScanner;

public class PerulanganFor4 {

	static MyLogger print = new MyLogger();
	
	public static void main(String[] args) {
		
		print.log("Perulangan for 4");
		
		int jumlah = 0;
		int batas;
		
		MyScanner input = new MyScanner();
		batas = input.nextInt("Masukan nilai batas");
		input.closeScanner();
		
		for (int i = 1; i <= batas; i++) {
			print.defaultLog(i);
			jumlah = jumlah + i;
			if (i < batas) {
				print.defaultLog(" + ");
			} else {
				print.defaultLog(" = ");
			}
		}
		print.log("");
		print.log("Jumlah = " + jumlah);}

}

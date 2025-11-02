package pekan5;

import shared.MyLogger;

public class PerulanganFor3 {

	static MyLogger print = new MyLogger();
	
	public static void main(String[] args) {
		
		print.log("Perulangan ke-3");
		
		int jumlah = 0;
		
		for (int i = 1; i <= 10; i++) {
			print.defaultLog(i);
			jumlah = jumlah + i;
			if (i < 10) {
				print.defaultLog(" + ");
			}
		}
		print.log("");
		print.log("Jumlah = " + jumlah);
	}

}

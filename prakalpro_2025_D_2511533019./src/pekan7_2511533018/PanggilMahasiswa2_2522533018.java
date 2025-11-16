package pekan7_2511533018;

import java.util.Scanner;

public class PanggilMahasiswa2_2522533018 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nama: ");
		String x = input.nextLine();
		
		System.out.println("NIM: ");
		String y = input.nextLine();
		
		Mahasiwa_2511533018 ms = new Mahasiwa_2511533018();
		ms.setNim2(x);
		ms.setNama(y);
		
		if (x.startsWith("25")) {
			System.out.println(ms.getNama() + " anda angkatan 2025.");
		} 
		if (ms.getNim2().contains("1153")) {
			System.out.println(y + " Anda mahasiswa Informatika.");
		} 
		
		ms.Cetak2();
		input.close();
		
	}

}

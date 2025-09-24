package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '&';
		
		// Menampilkan char
		System.out.println("Contoh variabel char: " );
		System.out.println("Huruf pertama " + huruf1);
		System.out.println("Huruf kedua " + huruf2);
		System.out.println("Angka " + angka);
		System.out.println("Simbol " + simbol);
		
		// Operasi dengan char berdasarkan ASCII
		char huruf3 = (char) (huruf1 + 1);
		System.out.println(huruf3);
		
		// Simpan char dalam int
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1).replace(' ', '0'));
		System.out.println("Kode ASCII dari " + huruf1 + "=" + kodeHuruf);
		System.out.println("Kode Biner dari " + huruf1 + "=" + biner1);
		
		// Menggabungkan huruf menjadi string
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan huruf = " + kata);
		
	}

}

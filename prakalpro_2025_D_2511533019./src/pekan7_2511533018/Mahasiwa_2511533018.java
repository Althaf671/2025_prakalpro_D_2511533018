package pekan7_2511533018;

public class Mahasiwa_2511533018 {

	private int nim;
	private String nama, nim2;
	
	public void setNim(int nim) {
		this.nim = nim;
	}
	
	public void setNim2(String nim2) {
		this.nim2 = nim2;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getNim() {
		return nim;
	}
	
	public String getNim2() {
		return nim2;
	}
	
	public String getNama() {
		return nama;
	}
	
	// method lain
	public void Cetak() {
		System.out.println("Nim " + nim);
		System.out.println("Nama " + nama);
	}
	
	public void Cetak2() {
		System.out.println("Nim " + nim2);
		System.out.println("Nama " + nama);
	}
}

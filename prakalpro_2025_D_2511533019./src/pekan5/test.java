package pekan5;

import shared.MyLogger;
import shared.MyScanner;

public class test {
	
	static MyLogger tampilkan = new MyLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyScanner tulis = new MyScanner(); 
		
		String a = tulis.nextString("Masukan nama");
		tampilkan.log(a);
		
	}

}

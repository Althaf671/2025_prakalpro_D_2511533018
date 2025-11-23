package shared;

import java.util.Scanner;

public class TugasFunction3_2511533018 {
    
    // Jumlah bil ganjil dengan batas berdasarkan input pengguna
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai terakhir penjumlahan: ");
        int a = input.nextInt();

        System.out.println(Penjumlahan(a));
    }

    // Method
    public static int Penjumlahan(int batas) {
        int b = 0;

        for (int i = 0; i <= batas; i++) {
            if (i % 2 == 1) {
                b = b + i;
            } else {
                continue;
            }
        }

        return b;
    }

}

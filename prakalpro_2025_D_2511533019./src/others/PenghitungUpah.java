package others;

import java.util.Scanner;

import shared.MyLogger;

public class PenghitungUpah {
    
    static MyLogger console = new MyLogger();

    public static void main(String[] args) {
        console.log("Memulai Program");

        // Golongan
        String GolonganA = "A";
        String GolonganB = "B";
        String GolonganC = "C";
        String GolonganD = "D";

        // Gaji karyawan pergolongan
        int gajiA = 1000;
        int gajiB = 2000;
        int gajiC = 3000;
        int gajiD = 4000;

        // Input nama karyawan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String nama = input.nextLine();

        // Input golongan karyawan
        System.out.print("Masukan golongan: ");
        String golongan = input.nextLine();

        // Input jam kerja karyawan
        System.out.print("Masukan jam kerja: ");
        int jamKerja = input.nextInt();

        console.log("Nama: " + nama);
        console.log("Golongan: " + golongan);
        console.log("Jam Kerja: " + jamKerja + " jam perminggu");


        if (golongan == GolonganA) {
            console.log(
                nama + "dengan golongan" + golongan + jamKerja + "jam perminggu"
            );
        }

    };

}

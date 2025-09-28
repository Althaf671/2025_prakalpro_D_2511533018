package others;

import java.util.Scanner;

import shared.MyLogger;

public class PenghitungUpah {
    
    static MyLogger console = new MyLogger();

    public static void main(String[] args) {
        console.log("Memulai Program");


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
        input.close();

        console.log("Nama: " + nama);
        console.log("Golongan: " + golongan);
        console.log("Jam Kerja: " + jamKerja + " jam perminggu");


        int upahPerJam = 0;

        if (golongan.equalsIgnoreCase("A")) {
            upahPerJam = 1000;
        } else if (golongan.equalsIgnoreCase("B")) {
            upahPerJam = 2000;
        } else if (golongan.equalsIgnoreCase("C")) {
            upahPerJam = 3000;
        } else if (golongan.equalsIgnoreCase("D")) {
            upahPerJam = 4000;
        }

        // Hitung gaji karyawan
        int gaji = jamKerja * upahPerJam;

        // Hitung lembur jika > 60
        if (jamKerja > 60) {
            int isLembur = (jamKerja - 60) * 5000;
            gaji += isLembur;
        }

        // Tampilkan ke layar
        console.log("//================================//");
        console.log("Nama Karyawan      : " + nama);
        console.log("Golongan           : " + golongan);
        console.log("Jam Kerja          : " + jamKerja + "jam");
        console.log("Upah perminggu     : " + gaji);
        console.log("//================================//");
    };

}

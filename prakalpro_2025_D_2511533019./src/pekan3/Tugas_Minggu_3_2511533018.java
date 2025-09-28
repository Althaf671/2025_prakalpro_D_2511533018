package pekan3;

import java.util.Scanner;

import shared.MyLogger;

public class Tugas_Minggu_3_2511533018 {
    
    static MyLogger tampilkan = new MyLogger();

    public static void main(String[] args) {
        tampilkan.log("Memulai program");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukan tinggi kerucut: ");
        double t = input.nextDouble();

        double volumeKerucut = (1.0 / 3.0) * 3.14 * r * r * t;
        tampilkan.log("Volume kerucut adalah: " + volumeKerucut);
        input.close();
    };

};

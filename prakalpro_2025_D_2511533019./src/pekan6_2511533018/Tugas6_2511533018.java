package pekan6_2511533018;

import java.util.Random;
import java.util.Scanner;

public class Tugas6_2511533018 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randValue = new Random();

        boolean victoryStatus = false;
        int trialCount = 0;
        boolean isRunning = true;

        while (isRunning) {
            int daduA = randValue.nextInt(6) + 1;
            int daduB = randValue.nextInt(6) + 1;
            int jumlahDadu = daduA + daduB;

            System.out.println(daduA + " + " + daduB + " = " + jumlahDadu);

            if (jumlahDadu == 7) {
                System.out.println("Anda benar!");
                victoryStatus = true;
            } else {
                System.out.println("Anda salah!");
                victoryStatus = false;
            }

            trialCount++;

            System.out.print("Apa anda ingin lanjut melempar dadu? (yes/no): ");
            String value = input.nextLine();

            if (value.equalsIgnoreCase("no")) {
                isRunning = false;
            } else {
                if (victoryStatus) {
                    trialCount = 0; 
                }
            }
        }

        if (victoryStatus) {
            System.out.println("Anda memenangkan permainan setelah " + trialCount + " percobaan!");
        } else {
            System.out.println("Skill issue");
        }

        input.close();
    }
}
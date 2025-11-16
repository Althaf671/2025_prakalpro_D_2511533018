package pekan7_2511533018;

import java.util.Scanner;

public class tugasAlproPekan7_2511533018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Akun account = new Akun();

        //=========== Registrasi User =========//
        System.out.println("//===== Program Registrasi =====//");

        // Input Username
        System.out.print("Input username: ");
        account.setUsername(input.nextLine());

        // Input Pssword
        System.out.print("Input password: ");
        account.setPassword(input.nextLine());

        // Input Email
        System.out.print("Input email: ");
        account.setEmail(input.nextLine());

        // Input PIN
        System.out.print("Input pin min 6 digits: ");
        account.setPinAngka(input.nextInt());

        System.out.println("//===== Memproses data anda :) =====//");

        // Validation
        boolean validPassword = account.isPasswordValid();
        boolean validEmail = account.isEmailValid();

        if (!validPassword) {
            System.out.println("Error: Password harus minimal 8 karakter!");
            System.out.println("Coba lagi");
        } 
        if (!validEmail) {
            System.out.println("Error: Email tidak valid, harus mengandung '@' dan '.'");
            System.out.println("Coba lagi");
        } 
        if (validPassword && validEmail) {
            System.out.println("\n=== Registrasi Berhasil untuk user: " + account.getUsername() + " ===");
            System.out.println("Username: " + account.getUsername().toUpperCase());
            System.out.println("Password: " + "*".repeat(account.getPassword().length()));
            System.out.println("Email: " + account.getEmail());
            System.out.println("PIN: " + account.getPinAngka());
        }

        input.close();
    }
}

package pekan7_2511533018;

public class Akun {
    private String username;
    private String password;
    private String email;
    private int pinAngka;
    
    // Buat username
    public void setUsername(String username) {
        this.username = username;
    }

    // Ambil username
    public String getUsername() {
        return username;
    }

    // Buat pwd
    public void setPassword(String password) {
        this.password = password;
    }

    // Ambil pwd
    public String getPassword() {
        return password;
    }

    // Buat email
    public void setEmail(String email) {
        this.email = email;
    }

    // Ambil email
    public String getEmail() {
        return email;
    }

    // Set pin
    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }

    // Ambil pin
    public int getPinAngka() {
        return pinAngka;
    }

    // Cek apakah pwd valid
    public boolean isPasswordValid() {
        return password.length() >= 8;
    }

    // Cek apakah email valid
    public boolean isEmailValid() {
        return email.contains("@") && email.contains(".");
    }
}

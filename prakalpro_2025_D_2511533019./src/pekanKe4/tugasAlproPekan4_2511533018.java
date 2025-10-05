package pekanKe4;

import shared.MyLogger;
import shared.MyScanner;

public class tugasAlproPekan4_2511533018 {
    
    static MyLogger tampilkan = new MyLogger();

    public static void main(String[] args) {
        tampilkan.log("Memulai Program");
        tampilkan.log("");

        // tipe data
        String nama;
        int totalTiket;
        int hari;
        int waktuTayang;
        int jenisStudio;
        int totalHarga;
        int hargaTiket = 0;
        int hargaStudio = 0;
        int pembayaran = 0;
        int diskon = 0;
        int totalHargaSebelumDikurangDiskon = 0;
        String filmPilihan;
        String jamTayang = "";
        String studio = "";
        String pilihanHari = "";

        // scanner
        MyScanner input = new MyScanner();

        // interface program
        tampilkan.log("//========== Selamat Datang di Bioskop =========//");
        tampilkan.log("");
        tampilkan.log("//========== Menu =========//");
        tampilkan.log("// Film Tersedia:");
        tampilkan.log("// 1." + " Horror di Yunand - 50k/person");
        tampilkan.log("// 2." + " Gedung yang dijanjikan - 50k/person");
        tampilkan.log("// 3." + " Awas ada Ating - 75k/person");        
        tampilkan.log("// 4." + " Pakai Atributmu! - 100k/person");
        tampilkan.log("// Studio Tersedia: ");
        tampilkan.log("// 1." + " Studio Regular - 0k/person");
        tampilkan.log("// 2." + " Studio Deluxe - 25k/person");
        tampilkan.log("// 3." + " Studio Premium - 50k/person");
        tampilkan.log("//=========================//");
        tampilkan.log("");

        tampilkan.log("// NOTE: Jika terdapat lebih dari 5 tiket di beli oleh satu penonton");
        tampilkan.log("// Maka akan mendapatkan diskon sebesar 10%");

        // form input data
        tampilkan.log("");
        tampilkan.log("//========== Silahkan isi form di bawah ==========//");

        // input nama
        nama = input.nextString("// Masukan nama anda");
        if (nama != null) {
        } else if (nama == null || nama.isEmpty()) {
            input.closeScanner();
            tampilkan.log("Input tidak boleh kosong.");
            tampilkan.log("");
            tampilkan.log(("Program Berakhir"));
            System.exit(0);
        };

        // input pilihan film
        filmPilihan = input.nextString("// Pilih film");
        switch (filmPilihan) {
            case "horror di yunand":
                hargaTiket = 50000;
                break;

            case "gedung yang dijanjikan":
                hargaTiket = 50000;
                break;

            case "awas ada ating":
                hargaTiket = 75000;
                break;

            case "pakai atributmu!":
                hargaTiket = 100000;
                break;

            default:
                input.closeScanner();
                tampilkan.log("Film tidak valid.");
                tampilkan.log("");
                tampilkan.log(("Program Berakhir"));
                System.exit(0);            
                break;
        }
        

        // input hari
        hari = input.nextInt("// Pilih hari penayangan");
        switch (hari) {
            case 1:
                pilihanHari = "Senin-Kamis";
                break;

            case 2:
                pilihanHari = "Jumat";
                break;

            case 3:
                pilihanHari = "Sabtu-Minggu";
                break;
        
            default:
                input.closeScanner();
                tampilkan.log("Hari tidak valid.");
                tampilkan.log("");
                tampilkan.log(("Program Berakhir"));
                System.exit(0);
                break;
        }

        // input waktu tayang
        waktuTayang = input.nextInt("// Pilih waktu tayang");
        switch (waktuTayang) {
            case 1:
                jamTayang = "10.00 - 12.00";
                break;
            case 2:
                jamTayang = "10.00 - 17.00";
                break;   
            case 3:
                jamTayang = "17.00 - 22.00";
                break;    
            default:
                input.closeScanner();
                tampilkan.log("Input tidak valid.");
                tampilkan.log(("Program Berakhir"));
                System.exit(0);
                break;
        }

        // input jenis studio
        jenisStudio = input.nextInt("// Pilih jenis studio");
        switch (jenisStudio) {
            case 1:
                hargaStudio = 0;
                studio = "Standard";
                break;

            case 2:
                hargaStudio = 25000;
                studio = "Deluxe";
                break;

            case 3:
                hargaStudio = 50000;
                studio = "Premium";
                break;
        
            default:
                input.closeScanner();
                tampilkan.log("jenis studio tidak valid.");
                tampilkan.log("");
                tampilkan.log(("Program Berakhir"));
                System.exit(0);
                break;
        };

        // input total tiket
        totalTiket = input.nextInt("// Masukan jumlah tiket");
        if (totalTiket != 0) {
        } else if (totalTiket == 0) {
            input.closeScanner();
            tampilkan.log("Input tidak valid.");
            tampilkan.log("");
            tampilkan.log(("Program Berakhir"));
            System.exit(0);
        };
        
        tampilkan.log("//================================================//");

        // logika harga tiket
        totalHarga = ((totalTiket * hargaTiket) + hargaStudio);
        if (totalTiket >= 5) {
            totalHargaSebelumDikurangDiskon = ((totalTiket * hargaTiket) + hargaStudio);
            totalHarga = totalHargaSebelumDikurangDiskon - (totalHargaSebelumDikurangDiskon / 10);
            diskon = totalHargaSebelumDikurangDiskon % totalHarga;
        };

        // invoice pembayaran
        tampilkan.log("");
        tampilkan.log("//========== Invoice Pembayaran =========//");
        tampilkan.log("// Nama: " + nama);
        tampilkan.log("// Hari penayangan: " + pilihanHari);
        tampilkan.log("// Jam Tayang: " + jamTayang);
        tampilkan.log("// Jenis Studio: "  + studio);
        tampilkan.log("// Jumlah Tiket: " + totalTiket);
        tampilkan.log("// Diskon: " + diskon);
        tampilkan.log("// Total Pembayaran: " + "IDR " + totalHarga);
        tampilkan.log("//=======================================//");
        tampilkan.log("");

        // pembayaran
        pembayaran = input.nextInt("* Masukan nominal pembayaran");
        if (pembayaran == totalHarga) {
        } else if (pembayaran < totalHarga) {
            input.closeScanner();
            tampilkan.log("Nominal tidak cukup");
            tampilkan.log("");
            tampilkan.log("Program Berakhir");
            System.exit(0);
        };
        input.closeScanner();

        // tiket masuk
        tampilkan.log("");
        tampilkan.log("Anda telah membayar sebesar " + "IDR " + pembayaran);
        tampilkan.log("Anda boleh masuk");


        tampilkan.log("");
        tampilkan.log(("Program Berakhir"));
    }
};

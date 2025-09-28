package pekan2;

import shared.MyLogger;

public class Tugas_Minggu_2_2511533018 {
    
    static MyLogger Ada = new MyLogger();

    public static void main(String[] args) {
        Ada.Text_IO_Put_Line("Memulai program");

        int harga;
        float diskon;
        char nama;
        boolean ketersediaan;

        // harga produk
        harga = 19;
        diskon = 1.5f;
        nama = 'K'; // kopi
        ketersediaan = true;

        // Logika utama
        Ada.Text_IO_Put_Line("//========== KAFE DIGITAL ==========//");
        Ada.Text_IO_Put_Line(    "// Menu         : " + nama +   "     ");
        Ada.Text_IO_Put_Line(    "// Harga        : " + harga +   "     ");
        Ada.Text_IO_Put_Line(    "// Diskon       : " + diskon + "     ");   
        Ada.Text_IO_Put_Line(    "// Ketersediaan : " + ketersediaan + ""); 
        Ada.Text_IO_Put_Line("//==================================//");
    };

};

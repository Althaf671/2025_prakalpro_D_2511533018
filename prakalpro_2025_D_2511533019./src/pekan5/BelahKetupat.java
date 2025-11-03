package pekan5;

public class BelahKetupat {
    public static void main(String[] args) {

        // I'm cooked dawg 🥀
        int titik = 4;
        int ukuran = 4;
        String header = "#";
        
        int panjang = titik * ukuran - 1;
        for (int i = 0; i < panjang + 1; i++) {
            header = header + "=";
        }
        header = header + "#";
        System.out.println(header);

        for (int i = 0; i < ukuran; i++) {
            String bingkai = "|";
            int spasi = (ukuran - 1) * 2;
            for (int j = 0; j < spasi - 2 * i; j++) {
                bingkai = bingkai + " ";
            }

            bingkai = bingkai + "<>";
            int jumlahTitik = titik * i;
            for (int j = 0; j < jumlahTitik; j++) {
                bingkai = bingkai + ".";
            }
            bingkai = bingkai + "<>";

            for (int j = 0; j < spasi - 2 * i; j++) {
                bingkai = bingkai + " ";
            }
            bingkai = bingkai + "|";

            System.out.println(bingkai);
        }

        for (int i = 0; i < ukuran; i++) {
            String bingkai = "|";
            int spasi = 0;
            for (int j = 0; j < spasi + 2 * i; j++) {
                bingkai = bingkai + " ";
            }

            bingkai = bingkai + "<>";
            int jumlahTitik = titik * (ukuran - (i + 1));
            for (int j = 0; j < jumlahTitik; j++) {
                bingkai = bingkai + ".";
            }
            bingkai = bingkai + "<>";

            for (int j = 0; j < spasi + 2 * i; j++) {
                bingkai = bingkai + " ";
            }
            bingkai = bingkai + "|";

            System.out.println(bingkai);
        }

        String footer = "#";
        for (int i = 0; i < panjang + 1; i++) {
            footer = footer + "=";
        }
        footer = footer + "#";
        System.out.println(footer);
        
        // // # Bingkai atas
        // System.out.print("#");
        // for(int i = 0; i < 17; i++) {
        //     System.out.print("=");
        // }
        // System.out.println("#");

        // // System.out.println("|.......<><>.......|");   
        // // System.out.println("|.....<>....<>.....|");      
        // // System.out.println("|....<>......<>....|");  
        // // System.out.println("|..<>..........<>..|");  
        // // System.out.println("|..<>..........<>..|");  
        // // System.out.println("|....<>......<>....|");  
        // // System.out.println("|.....<>....<>.....|");  
        // // System.out.println("|.......<><>.......|");  

		// for (int i = 0; i <= 8; i++) {

        //     for(int k = 0; k <= 17; k++) {
        //         System.out.print("*");
        //     }
		// 	for (int j = 0; j <= 1; j++) {
		// 		System.out.print("");
		// 	}
        //     System.out.println("|");

		// }

        // // dahlah

        // // # Bingkai bawah
        // System.out.print("#");
        // for(int i = 0; i < 17; i++) {
        //     System.out.print("=");
        // }
        // System.out.println("#");

    }
}


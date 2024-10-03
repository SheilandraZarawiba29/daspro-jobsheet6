import java.util.Scanner;

public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        String menu, member, qris;
        int pilihan_menu, harga, potonganQris;
        double total_bayar = 0, diskon;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input28.nextInt();
        input28.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input28.nextLine();
        System.out.println("Apakah menggunakan Qris (y/n) ? ");
        qris = input28.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =  " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =  " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =  " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =  " + harga); 
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);

        } else {
            System.out.println("Member tidak valid");
        }

        if (qris.equalsIgnoreCase("y")) {
            potonganQris = 1000;
            total_bayar -= potonganQris;
            System.out.println("Total bayar = " + total_bayar);
        }
       System.out.println("--------------------------------------");
    }
}

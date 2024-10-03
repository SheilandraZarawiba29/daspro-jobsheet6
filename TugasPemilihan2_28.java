
import java.util.Scanner;

public class TugasPemilihan2_28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int jumlahbuku, harga = 20000;
        String jenisbuku;
        double diskon = 0, totaldiskon, totalbiaya, totalkeseluruhan;

        System.out.println("Masukkan jenis buku : (kamus/novel/bukulain)");
        jenisbuku = input28.nextLine();
        System.out.println("Masukkan jumlah buku : ");
        jumlahbuku = input28.nextInt();

        if (jenisbuku.equalsIgnoreCase("Kamus")) {
            diskon = 0.10;  
            if (jumlahbuku > 2) {
                diskon += 0.02;  
            }
        } else if (jenisbuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;  
            if (jumlahbuku > 3) {
                diskon += 0.02;  
            } else {
                diskon += 0.01;  
            }
        } else {
            if (jumlahbuku > 3) {
                diskon = 0.05;  
            }
        }

        totaldiskon = harga * diskon;
        totalbiaya = harga - totaldiskon;
        totalkeseluruhan = totalbiaya * jumlahbuku;

        System.out.println("Jumlah diskon: Rp. " + (jumlahbuku*totaldiskon));
        System.out.println("Total yang harus dibayar: Rp. " + totalkeseluruhan);
    }
}

import java.util.Scanner;

public class Pemilihan2Percobaan128 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input28.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun kabisat");
            else 
                System.out.println("Bukan tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}
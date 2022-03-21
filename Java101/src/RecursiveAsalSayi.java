import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        System.out.println(asalMi(sayi, 2));
    }

    static boolean asalMi(int i, int sayi) {
        boolean result;
        if (i >= sayi) {
            System.out.println(sayi + " sayısı ASALDIR !");
            result = true;
        } else if (sayi % i == 0) {
            System.out.println(sayi + " sayısı ASAL değildir !");
            result = false;
        } else {
            result = asalMi(sayi, i + 1);
        }
        return result;
    }
}

import java.util.Scanner;

public class YildizIleUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int girilenSayi = input.nextInt();


        //Yıldız ile Üçgen Yapımı

        for (int i = 0; i < girilenSayi; i++) {
            for (int j = girilenSayi; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("********* Yıldız İle Elmas Yapımı ***********");
        //Yıldız ile Elmas Yapımı

        for (int i = 0; i < girilenSayi; i++) {
            for (int j = girilenSayi; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = girilenSayi; i > 0; i--) {
            for (int j = girilenSayi+1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

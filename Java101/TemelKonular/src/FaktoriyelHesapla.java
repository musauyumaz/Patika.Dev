import java.util.Scanner;

public class FaktoriyelHesapla {
    public static void main(String[] args) {
        int girilenSayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli Alınacak Sayıyı Giriniz : ");
        girilenSayi = input.nextInt();

        int faktoriyel = 1;
        for (int i = girilenSayi; i >= 1; i--) {
            faktoriyel *= i;
        }

        System.out.println(faktoriyel);

        System.out.println("************* Kombinasyon *************");
        int sayi1, sayi2, kombinasyon, faktoriyel1 = 1, faktoriyel2 = 1, faktoriyel3 = 1;
        System.out.print("Kombinasyon için 1.Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("Kombinasyon için 2.Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        for (int i = sayi1; i >= 1; i--) {
            faktoriyel1 *= i;
        }
        for (int i = sayi2; i >= 1; i--)
            faktoriyel2 *= i;
        for (int i = sayi1 - sayi2; i >= 1; i--)
            faktoriyel3 *= i;

        kombinasyon = (faktoriyel1 / (faktoriyel2 * (faktoriyel3)));

        System.out.println("Kombinasyon :" + kombinasyon);

    }
}

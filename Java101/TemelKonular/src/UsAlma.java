import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        //While Döngüsü
        int us, sayi, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi = input.nextInt();
        System.out.print("Üs: ");
        us = input.nextInt();
        int i = 1;
        while (us >= i) {
            sonuc *= sayi;
            i++;
        }
        System.out.println("While Döngüsü Sonuç : " + sonuc);
        sonuc =1;
        //For Döngüsü
        for (int j = 1; j <= us; j++)
            sonuc *= sayi;

        System.out.println("For Döngüsü Sonuc : " + sonuc);

    }
}

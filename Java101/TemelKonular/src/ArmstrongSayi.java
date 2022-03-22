import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();
        int hafizadakiSayi = sayi;
        int basamakSayisi = 0, basamakDegeri, toplam = 0, usluSayi = 1;
        while (hafizadakiSayi != 0) {
            hafizadakiSayi /= 10;
            basamakSayisi++;
        }
        hafizadakiSayi = sayi;
        while (hafizadakiSayi != 0) {
            basamakDegeri = hafizadakiSayi % 10;
            usluSayi = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                usluSayi *= basamakDegeri;
            }
            toplam += usluSayi;
            hafizadakiSayi /= 10;
        }

        System.out.println(toplam);

        if (toplam == sayi) {
            System.out.println(toplam + " sayısı bir Armstrong Sayidir");
        } else {
            System.out.println(sayi + " sayısı Armstrong Sayı değildir");
        }

//      *******   Sayılarının Basamak Değerlerinin Toplamı **********
        System.out.println("Basamak Sayılarının Toplamı");
        int gelenDeger = input.nextInt();
        int basDeger, basamakToplam = 0;

        while (gelenDeger != 0) {
            basDeger = gelenDeger % 10;
            basamakToplam += basDeger;
            gelenDeger /= 10;
        }

        System.out.println("Basamak Sayılarının Toplamı: " + basamakToplam);

    }
}

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulma {
    public static void main(String[] args) {
        int gelenSayi, gelenSayi1, toplam = 0,sayac=0;
        System.out.println("********** Çift Sayi **********");
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        gelenSayi = input.nextInt();
        int i=0;
        while (i<=gelenSayi) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
        System.out.println("********** 3 ve 4'e tam bölünen sayıların ortalaması **********");
        System.out.print("Sayı Giriniz: ");
        gelenSayi1 = input.nextInt();

        for (int j = 0; j < gelenSayi1; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                sayac+=1;
                toplam += j;
            }
        }
        System.out.println("Toplam Sayi Adeti: "+sayac);
        System.out.println("Sayıların Toplamı : "+toplam);
        System.out.println("Ortalama: " +((float)toplam / sayac));

    }
}

import java.util.Scanner;

public class GirilenTekSayilarinToplami {
    public static void main(String[] args) {
        int sayi,toplam=0,sayi1,ciftToplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz:");
            sayi = input.nextInt();
            if (!(sayi %2==0) && sayi>0)
                toplam+=sayi;

        }
        while (sayi>0);
        System.out.println("Tek Sayıların Toplamı: "+toplam);


        System.out.println(" Çift ve 4'ün katları olan sayılar");

        do {
            System.out.print("Sayı Giriniz:");
            sayi1 = input.nextInt();
            if ((sayi1 %4==0)&&(sayi1%2==0))
                ciftToplam+=sayi1;
        }
        while (sayi1%2==0);

        System.out.println("Çift ve 4'ün katları olan sayıların Toplamı : "+ciftToplam);
    }
}

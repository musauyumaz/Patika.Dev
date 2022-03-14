import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        float mesafe, biletUcreti, kmUcreti = 0.10f, toplamFiyat = 0, indirimliFiyat = 0;
        byte yas, yolculukTipi;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextFloat();
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextByte();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextByte();

        toplamFiyat = mesafe * kmUcreti;
        switch (yolculukTipi) {
            case 1:
                break;
            case 2:
                indirimliFiyat = (float) (toplamFiyat - (toplamFiyat * 0.2)) * 2;
                toplamFiyat = 2 * mesafe * kmUcreti;
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız ");
                System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                yolculukTipi = input.nextByte();
                break;
        }

        if (yas < 0) {
            System.out.println("Hatalı Veri Girdiniz");
            System.out.println("Yaşınızı giriniz : ");
            yas = input.nextByte();
        } else if (yas < 12) {
            indirimliFiyat -= (indirimliFiyat * 0.5);
        } else if (yas > 12 && yas < 24) {
            indirimliFiyat -= (indirimliFiyat * 0.1);
        } else if (yas > 24 && yas > 65)
            indirimliFiyat -= (indirimliFiyat * 0.3);


        System.out.println("Toplam Tutar : " + toplamFiyat);
        System.out.println("İndirim Sonrası Fiyat : " + indirimliFiyat);
    }
}

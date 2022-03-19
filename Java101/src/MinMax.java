import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayiAdedi,enBuyuk= 0,enKucuk =0,sayi;
        System.out.println("Gireceğiniz Sayı Adetini Belirleyiniz");
        sayiAdedi = input.nextInt();

        for (int i = 1;i<=sayiAdedi;i++)
        {
            System.out.println(i + ". Sayıyı Giriniz: ");
            sayi = input.nextInt();

            if (sayi>enBuyuk)
                enBuyuk = sayi;
            if (sayi<enKucuk)
                enKucuk = sayi;
        }

        System.out.println("En Büyük Sayı : "+enBuyuk);
        System.out.println("En Küçük Sayı : "+enKucuk);

    }
}

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2, enBuyukOrtakBolen = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayı : ");
        sayi1 = input.nextInt();
        System.out.println("2.Sayı : ");
        sayi2 = input.nextInt();

        for (int i = 1; i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                if (i > enBuyukOrtakBolen) {
                    enBuyukOrtakBolen = i;
                }
            }
        }
        int ekok = (sayi1 * sayi2)/enBuyukOrtakBolen;
        System.out.println("[For]İki sayının En Büyük Ortak Böleni : " +enBuyukOrtakBolen);
        System.out.println("[For]İki sayının En Küçük Ortak Katı : "+ekok);


        System.out.println();
        System.out.println("***************** WHİLE *****************");

        int i =1;
        while (i<=sayi1) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                if (i > enBuyukOrtakBolen) {
                    enBuyukOrtakBolen = i;
                }

            }
            i++;
        }
        ekok = (sayi1 * sayi2)/enBuyukOrtakBolen;
        System.out.println("[While]İki sayının En Büyük Ortak Böleni : " +enBuyukOrtakBolen);
        System.out.println("[While]İki sayının En Küçük Ortak Katı : " +ekok);
    }
}

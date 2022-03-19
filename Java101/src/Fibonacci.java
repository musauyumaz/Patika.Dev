import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sonuc = 0, sayi2 = 0, sayi1 = 0;

        System.out.print("Eleman Sayısı : ");
        sayi = input.nextInt();

        System.out.println(sayi2);
        sayi2 =1;
        System.out.println(sayi2);
        for (int i = 2; i < sayi; i++) {

            sonuc = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = sonuc;

            System.out.println(sonuc);
        }


    }
}

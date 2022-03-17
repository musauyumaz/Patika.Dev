import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        System.out.print("Bir Sayı Giriniz: ");
        Scanner input = new Scanner(System.in);
        float sayi = input.nextInt();
        float toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam += (float) (1.0 / i);
            System.out.println(1  + "/"+ i);
        }

        System.out.println("Sonuç : "+(float) toplam);
    }
}

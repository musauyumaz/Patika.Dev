import java.util.Scanner;

public class AsalSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Başlangıç Sayısı :");
        int baslangic = input.nextInt();
        System.out.print("Bitiş Sayısı :");
        int bitis = input.nextInt();

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    System.out.println(i + " ");
                }
                break;
            }
        }
    }
}

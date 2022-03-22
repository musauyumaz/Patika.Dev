import java.util.Scanner;

public class Tersucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayısını Girin : ");
        int basamakSayisi = input.nextInt();
        for (int i = basamakSayisi; i >= 0; i--) {
            for (int j = 1; j <=basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}

import java.util.Scanner;

public class DaireCevreAlan {
    public static void main(String[] args) {
        double cevre,alan,yaricap;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz :");
        yaricap = input.nextDouble();

        alan = Math.PI * yaricap *yaricap;
        cevre = Math.PI *2*yaricap;

        System.out.println("Alanı : "+alan);
        System.out.println("Çevresi : "+cevre);
    }
}

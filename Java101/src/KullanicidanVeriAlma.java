import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        int a;
        double b;
        Scanner input = new Scanner(System.in);
        System.out.print("a Sayısını Giriniz:");
        a = input.nextInt();
        System.out.println(a);

        System.out.print("b Sayısını Giriniz:");
        b = input.nextDouble();
        System.out.println(b);

        System.out.print("stryi giriniz:");
        String str = input.nextLine();
        System.out.println(str);
    }
}

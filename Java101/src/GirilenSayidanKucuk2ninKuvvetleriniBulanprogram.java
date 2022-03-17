import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanprogram {
    public static void main(String[] args) {
        int girilenSayi,girilenSayi2;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        girilenSayi = input.nextInt();

        for (int i=1;i<girilenSayi;i*=2)
        {
            System.out.println(i);
        }

        System.out.println("4 ve 5'in kuvvetleri");
        System.out.print("Sınır Sayısını Giriniz: ");
        girilenSayi2 = input.nextInt();

        System.out.println("5'in kuvvetleri");
        for (int i=1;i<girilenSayi2;i*=5)
            System.out.println(i);
        System.out.println();
        System.out.println("4'ün kuvvetleri");
        for (int i=1;i<girilenSayi2;i*=4)
            System.out.println(i);
    }
}

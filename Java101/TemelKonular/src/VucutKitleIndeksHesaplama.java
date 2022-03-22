import java.util.Scanner;

public class VucutKitleIndeksHesaplama {
    public static void main(String[] args) {
        double boy,kilo,vucutKitleIndeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextFloat();

        vucutKitleIndeks = kilo / Math.pow(boy,2);
        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeks);

    }
}

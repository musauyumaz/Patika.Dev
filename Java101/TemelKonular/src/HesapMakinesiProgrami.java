import java.util.Scanner;

public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        float sayi1, sayi2, sonuc;
        String islem;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        sayi1 = input.nextFloat();
        System.out.print("2.Sayıyı Giriniz: ");
        sayi2 = input.nextFloat();
        System.out.print("Yaptırmak İstediğiniz İşlemi Giriniz (+,-,*,/): ");
        islem = input.next();



        switch (islem) {
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                if (sayi2 == 0)
                    System.out.println("Bölme İşleminde 2.Sayiyi 0 giremezsiniz");
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatalı İşlem Tekrar Deneyiniz")
                ;break;

        }

    }
}

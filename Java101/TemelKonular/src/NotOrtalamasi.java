import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        byte matematikPuan,fizikPuan,kimyaPuan,turkcePuan,tarihPuan,muzikPuan;
        double ort;
        boolean durum;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik puanınızı giriniz:");
        matematikPuan = input.nextByte();
        System.out.print("Lütfen Fİzik puanınızı giriniz:");
        fizikPuan = input.nextByte();
        System.out.print("Lütfen Kimya puanınızı giriniz:");
        kimyaPuan = input.nextByte();
        System.out.print("Lütfen Türkçe puanınızı giriniz:");
        turkcePuan = input.nextByte();
        System.out.print("Lütfen Tarih puanınızı giriniz:");
        tarihPuan = input.nextByte();
        System.out.print("Lütfen Müzik puanınızı giriniz:");
        muzikPuan = input.nextByte();

        ort = (matematikPuan+fizikPuan+kimyaPuan+turkcePuan+tarihPuan+muzikPuan)/6;
        durum = ort>=60;
        System.out.println("Ortalamanız : "+ ort);
        String sonuc = durum ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.println(sonuc);


    }
}

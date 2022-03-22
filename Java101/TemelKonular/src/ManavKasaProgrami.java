import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        float armutFiyat = 2.14f,elmaFiyat=3.67f,domatesFiyat=1.11f,muzFiyat=0.95f,patlicanFiyat=5,toplamTutar=0,
                armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = input.nextFloat();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = input.nextFloat();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = input.nextFloat();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKilo = input.nextFloat();

        toplamTutar += (armutKilo*armutFiyat)+(elmaFiyat*elmaKilo)+(domatesFiyat*domatesKilo)+(muzFiyat*muzKilo)+(patlicanFiyat*patlicanKilo);
        System.out.println("Toplam Tutar : "+toplamTutar  +" TL");


    }
}

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km,kmTutar=2.20,odenecekTutar=0 ,acilisUcreti =10;
        boolean tutar20TlMi;
        System.out.print("Toplam Km: ");
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        odenecekTutar += acilisUcreti + (km*kmTutar);
        tutar20TlMi = odenecekTutar>=20;

        odenecekTutar = tutar20TlMi ? odenecekTutar : 20;

        System.out.println("Odenecek Toplam Tutar : "+odenecekTutar);
        System.out.println("Açılış Ücreti : "+acilisUcreti);




    }
}

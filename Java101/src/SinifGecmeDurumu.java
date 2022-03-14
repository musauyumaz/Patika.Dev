import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        byte mat, fizik, turkce, kimya, muzik;
        float ortalama = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextByte();
        System.out.println("Fizik Notunuz: ");
        fizik = input.nextByte();
        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextByte();
        System.out.println("Kimya Notunuz: ");
        kimya = input.nextByte();
        System.out.println("Müzik Notunuz: ");
        muzik = input.nextByte();

        if ((mat >= 0 && mat <= 100)) {
            ortalama += mat;
            System.out.println("Matematik Notunuz Eklendi");
        }
        if ((fizik >= 0 && fizik <= 100)) {
            ortalama += fizik;
            System.out.println("Fizik Notunuz Eklendi");
        }
        if ((kimya >= 0 && kimya <= 100)) {
            ortalama += kimya;
            System.out.println("Kimya Notunuz Eklendi");
        }
        if ((turkce >= 0 && turkce <= 100)) {
            ortalama += turkce;
            System.out.println("Türkçe Notunuz Eklendi");
        }
        if ((muzik >= 0 && muzik <= 100)) {
            ortalama += muzik;
            System.out.println("Müzik Notunuz Eklendi");
        }
        else
        {
            System.out.println("Malesefki geçersiz notları sistemdeki ortalamaya ekleyemedik");
        }


        ortalama /= 5;

        if (ortalama >= 55) {
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("Ortalamanız : "+ortalama);
        }
        else
        {
            System.out.println("Maalesef Sınıfta Kaldınız Seneye Görüşmek Üzere");
            System.out.println("Ortalamanız : "+ortalama);
        }

    }
}

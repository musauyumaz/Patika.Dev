import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Yıl Giriniz : ");
        yil = input.nextInt();

        sonuc = yil % 4;

        if (yil % 100 ==0)
        {
            sonuc = yil %400;
        }
        if (sonuc == 0)
        {
            System.out.println(yil+" bir artık yıldır !");
        }else
        {
            System.out.println(yil+" bir artık yıldır değildir !");
        }
    }
}

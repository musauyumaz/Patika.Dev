import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
//        double hipotenus,kenar1,kenar2;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Lütfen 1. Kenarı Giriniz:");
//        kenar1 = input.nextFloat();
//        System.out.print("Lütfen 2. Kenarı Giriniz:");
//        kenar2 = input.nextFloat();
//
//        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
//        System.out.println("Hipotenüs :"+hipotenus);

        double kenar1,kenar2,kenar3,alan,cevreYarisi,cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. Kenarı Giriniz:");
        kenar1 = input.nextDouble();
        System.out.print("Lütfen 2. Kenarı Giriniz:");
        kenar2 = input.nextDouble();
        System.out.print("Lütfen 3. Kenarı Giriniz:");
        kenar3 = input.nextDouble();
        cevre = (kenar1+kenar2+kenar3);
        cevreYarisi = cevre/2;
        alan = Math.sqrt((cevreYarisi*(cevreYarisi-kenar1)*(cevreYarisi-kenar2)*cevreYarisi-kenar3));

        System.out.println("Çevresi : "+cevre);
        System.out.println("Alanı : "+alan);
    }
}

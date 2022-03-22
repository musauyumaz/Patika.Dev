import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {

        menu();
    }

    static void plus() {
        float sayi, result = 0;
        Scanner input = new Scanner(System.in);
        result = 0;
        while (true) {
            System.out.print("Sayıları Giriniz : ");
            sayi = input.nextFloat();
            result += sayi;
            if (sayi == 0)
                break;
        }
        System.out.println("Toplam Sonucu : " + result);

    }

    static void minus() {
        float sayi, result = 0;
        Scanner input = new Scanner(System.in);
        result = 0;
        while (true) {
            System.out.print("Sayıları Giriniz : ");
            sayi = input.nextInt();
            result -= sayi;
            if (sayi == 0)
                break;
        }
        System.out.println("Fark Sonucu : " + result);

    }

    static void divided() {
        float sayi, result = 0, sayi2;
        Scanner input = new Scanner(System.in);
        result = 0;
        while (true) {
            System.out.print("Sayıları Giriniz : ");
            sayi = input.nextInt();
            System.out.print("Sayıları Giriniz : ");
            sayi2 = input.nextInt();
            if (sayi == 0 || sayi2 == 0)
                break;
            result = (sayi / sayi2);

        }
        System.out.println("Bölüm Sonucu : " + result);

    }

    static void multiplication() {
        float sayi, result = 0, sayi2;
        Scanner input = new Scanner(System.in);
        result = 1;
        while (true) {
            System.out.print("Sayıları Giriniz : ");
            sayi = input.nextInt();
            result *= sayi;
            if (sayi == 0)
                break;
        }
        System.out.println("Çarpım Sonucu : " + result);

    }

    static void pow() {
        Scanner input = new Scanner(System.in);
        float sayi = 0, result = 1, us;
        while (true) {
            System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
            sayi = input.nextFloat();
            System.out.print("Sayının Üssünü Giriniz : ");
            us = input.nextFloat();

            for (int i = 1; i <= us; i++) {
                result *= sayi;
            }
            System.out.println(sayi + " üssü " + us + " =" + result);
        }
    }

    static void mode() {
        Scanner input = new Scanner(System.in);
        float sayi = 0, result = 1, mod;
        while (true) {
            System.out.print("Modu Alınacak Sayıyı Giriniz : ");
            sayi = input.nextFloat();
            System.out.print("Modunu Giriniz : ");
            mod = input.nextFloat();

            result = sayi % mod;
            System.out.println(sayi + " % " + mod + " : " + result);
        }
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        float n = scan.nextInt();
        float result = 1f;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        float kenar1, result = 1, kenar2;
        while (true) {
            System.out.print("Kenar 1 : ");
            kenar1 = input.nextFloat();
            System.out.print("Kenar 2 : ");
            kenar2 = input.nextFloat();
            float alan = kenar1 * kenar2;
            float cevre = 2 * (kenar1 + kenar2);
            System.out.println("Dikdörtgenin Alanı : " + alan);
            System.out.println("Dikdörtgenin Çevresi : " + cevre);
        }
    }

    static void menu() {
        Scanner scan = new Scanner(System.in);
        int select;
        do {
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktöriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan Çevre");
            System.out.println("9- Çıkış Yap");
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}

package MayınTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSwapper {
    private String[][] tarla;
    private String[][] mayinliTarla;
    private int satir;
    private int sutun;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    MineSwapper(int satir, int sutun) {
        this.tarla = new String[satir][sutun];
        this.mayinliTarla = new String[satir][sutun];
    }

    private String[][] tarlaOlustur(String[][] olusturulacakTarla) {
        for (int i = 0; i < olusturulacakTarla.length; i++) {
            for (int j = 0; j < olusturulacakTarla[i].length; j++) {
                olusturulacakTarla[i][j] = " - ";
            }
        }
        return olusturulacakTarla;
    }

    private String[][] mayinYeri(String[][] mayin) {

        int mayinSayisi = (mayin.length * mayin[0].length) / 4;
        for (int i = 1; i <= mayinSayisi; i++) {
            int random1 = random.nextInt(this.mayinliTarla.length);
            int random2 = random2 = random.nextInt(this.mayinliTarla[0].length);
            if (!mayin[random1][random2].equals(" * ")) {
                mayin[random1][random2] = " * ";
            } else
                i--;
        }
        return mayin;
    }

    private void tarlaYazdir(String[][] yazdiralacakTarla) {
        for (String[] row : yazdiralacakTarla) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    void run() {
        System.out.println("Mayınların Konumu");
        var bosTarla = tarlaOlustur(this.tarla);
        var bombaliTarla = tarlaOlustur(this.mayinliTarla);
        var mayinKonumu = mayinYeri(this.mayinliTarla);
        tarlaYazdir(this.mayinliTarla);
        System.out.println("==================================================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        tarlaYazdir(this.tarla);
        while (true) {
            kullanicidanVeriAl();
            if (!hatalar(this.mayinliTarla, satir, sutun)) {
                break;
            }
            bombaSayisiYaz(this.mayinliTarla, this.tarla, satir, sutun);
        }
    }

    private void kullanicidanVeriAl() {

        System.out.print("Satır Giriniz : ");
        satir = input.nextInt();
        System.out.print("Sütun Giriniz : ");
        sutun = input.nextInt();
        System.out.println("==================================================");
    }

    private boolean hatalar(String[][] hatalarTarlasi, int satir, int sutun) {
        if (satir >= hatalarTarlasi.length || sutun >= hatalarTarlasi[0].length || satir < 0 || sutun < 0) {
            System.out.println("Lütfen tarla sınırlarında değer giriniz.");
            kullanicidanVeriAl();
            return false;
        }

        if (hatalarTarlasi[satir][sutun].equals(" * ")) {
            System.out.println("Ne yazık ki mayına bastınız  :(");
            System.out.println("!!! GAME OVER !!!");
            return false;
        } else
            return true;
    }

    private void bombaSayisiYaz(String[][] mayinBulunacakTarla, String[][] sayiYazilacakTarla, int satir, int sutun) {
        int sayac = 0;
        int baslangicSatiri = satir - 1;
        int baslangicSutunu = sutun - 1;
        int bitisSatir = satir + 1;
        int bitisSutun = sutun + 1;
        if (baslangicSatiri != 0 && baslangicSutunu != 0 && bitisSatir != mayinBulunacakTarla.length && bitisSutun != mayinBulunacakTarla[0].length) {
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);

        }
        if (baslangicSutunu <= 0 && bitisSutun <= 0) {
            baslangicSutunu += 1;
            baslangicSatiri += 1;
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);
        }
        if (bitisSatir >= mayinBulunacakTarla.length) {
            bitisSatir -= 1;
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);
        }
        if (baslangicSatiri <= 0) {
            baslangicSatiri += 1;
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);
        }
        if (bitisSutun >= mayinBulunacakTarla[0].length) {
            bitisSutun -= 1;
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);

        }
        if (baslangicSutunu <= 0) {
            baslangicSutunu += 1;
            sayac = bombaBul(mayinBulunacakTarla, baslangicSatiri, baslangicSutunu, bitisSatir, bitisSutun);

        }

        sayiYazilacakTarla[satir][sutun] = " " + sayac + " ";
        tarlaYazdir(sayiYazilacakTarla);


    }

    private int bombaBul(String[][] mayinBulunacakTarla, int baslangicSatir, int baslangicSutun, int bitisSatir, int bitisSutun) {
        int sayac = 0;
        for (int i = baslangicSatir; i <= bitisSatir; i++) {
            for (int j = baslangicSutun; j <= bitisSutun; j++) {
                if (mayinBulunacakTarla[i][j].equals(" * ")) {
                    sayac++;
                }
            }
        }
        return sayac;
    }

}

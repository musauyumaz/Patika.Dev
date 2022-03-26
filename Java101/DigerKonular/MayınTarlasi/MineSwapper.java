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
        if (satir != 0 && sutun != 0 && satir != mayinBulunacakTarla.length && sutun != mayinBulunacakTarla[0].length) {
            sayac = bombaBul(mayinBulunacakTarla, satir, sutun);
            tarlaYazdir(sayiYazilacakTarla);
            sayiYazilacakTarla[satir][sutun] = " " + sayac + " ";
        } else if ((satir + 1) >= mayinBulunacakTarla.length && (sutun + 1) >= mayinBulunacakTarla[0].length) {

        }


    }

    private int bombaBul(String[][] mayinBulunacakTarla, int satir, int sutun) {
        int sayac = 0;
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (mayinBulunacakTarla[i][j].equals(" * ")) {
                    sayac++;
                }
            }
        }
        return sayac;
    }

}

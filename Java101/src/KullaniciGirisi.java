import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, sifirlama, yeniSifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifre:");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("musa") && sifre.equals("uyumaz")) {
            System.out.println("Giriş Başarılı");
        } else if (kullaniciAdi.equals("musa") && !sifre.equals("uyumaz")) {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz (E,H)");
            sifirlama = input.nextLine();
            if (sifirlama.equals("E")) {
                System.out.println("Yeni Şifrenizi Giriniz: ");
                yeniSifre = input.nextLine();
                if (!yeniSifre.equals("uyumaz")) {
                    sifre = yeniSifre;
                    System.out.println("Şifreniz Değiştirilmiştir");

                } else {
                    System.out.println("Yeni Şifreniz Eski şifrenizle aynı olamaz");
                }

            }

        } else {
            System.out.println("Bilgiler Yanlıştır");
        }

    }
}

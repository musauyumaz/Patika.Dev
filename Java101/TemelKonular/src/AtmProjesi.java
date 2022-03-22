import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        float girisHakki = 3, hesap = 2000, cekilen, yatirilan;
        int secilen;


        while (girisHakki >= 0) {
            System.out.print("Kullanıcı Adı :");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifre :");
            sifre = input.nextLine();
            if (kullaniciAdi == "musa" && sifre == "uyumaz") {
                System.out.println("Giriş Başarılı");
                System.out.println("1-Para Yatırma");
                System.out.println("2-Para Çekme");
                System.out.println("3-Bakiye Sorgulama");
                System.out.println("4-Çıkış Yap");
                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                secilen = input.nextInt();

                if (secilen == 1) {
                    System.out.println("Hesabınızdaki Para : " + hesap);
                    System.out.print("Yatırılacak Para Miktarı :");
                    yatirilan = input.nextFloat();
                    hesap += yatirilan;
                    System.out.println("Hesaptaki Toplam Para : " + hesap);
                } else if (secilen == 2) {
                    if (hesap >= 0) {
                        System.out.print("Çekilecek Para Miktarı :");
                        System.out.println("Hesabınızdaki Para : " + hesap);
                        cekilen = input.nextFloat();
                        if (cekilen >= hesap) {
                            System.out.println("Maalesef Bakiyeniz Yetersiz Toplam Bakiyeniz : " + hesap);
                        }
                        hesap -= cekilen;
                        System.out.println("Hesapta Kalan Para : " + hesap);
                    } else {
                        System.out.println("Maalesef Bakiyeniz Yetersiz");
                    }
                } else if (secilen == 3) {
                    System.out.println("Bakiyeniz : " + hesap);
                } else if (secilen == 4) {
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                }

                girisHakki = 3;
            } else {
                girisHakki--;
                System.out.println("Yanlış Kullanıcı Adı ve Şifre Kalan Giriş Hakkınız : " + girisHakki);
            }
            if (girisHakki < 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
            }
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("**************** Switch Case ****************");


        while (girisHakki >= 0) {
            System.out.print("Kullanıcı Adı :");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifre :");
            sifre = input.nextLine();
            if (kullaniciAdi == "musa" && sifre == "uyumaz") {
                System.out.println("Giriş Başarılı");
                System.out.println("1-Para Yatırma");
                System.out.println("2-Para Çekme");
                System.out.println("3-Bakiye Sorgulama");
                System.out.println("4-Çıkış Yap");
                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                secilen = input.nextInt();
                switch (secilen) {
                    case 1: {
                        System.out.println("Hesabınızdaki Para : " + hesap);
                        System.out.print("Yatırılacak Para Miktarı :");
                        yatirilan = input.nextFloat();
                        hesap += yatirilan;
                        System.out.println("Hesaptaki Toplam Para : " + hesap);
                        break;
                    }
                    case 2: {
                        if (hesap >= 0) {
                            System.out.print("Çekilecek Para Miktarı :");
                            System.out.println("Hesabınızdaki Para : " + hesap);
                            cekilen = input.nextFloat();
                            if (cekilen >= hesap) {
                                System.out.println("Maalesef Bakiyeniz Yetersiz Toplam Bakiyeniz : " + hesap);
                            }
                            hesap -= cekilen;
                            System.out.println("Hesapta Kalan Para : " + hesap);
                        } else {
                            System.out.println("Maalesef Bakiyeniz Yetersiz");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Bakiyeniz : " + hesap);
                        break;
                    }
                    case 4: {
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    }
                    default:
                        System.out.println("Geçersiz Bir Değer Girdiniz ");
                        break;
                }

                girisHakki = 3;
            } else {
                girisHakki--;
                System.out.println("Yanlış Kullanıcı Adı ve Şifre Kalan Giriş Hakkınız : " + girisHakki);
            }
            if (girisHakki < 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
            }
        }
    }

}

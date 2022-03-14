import java.util.Scanner;

public class HavayaGoreEtkinlik {
    public static void main(String[] args) {
        float sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklığı Girin: ");
        sicaklik = input.nextFloat();

//        if (sicaklik < 5) {
//            System.out.println("Kayak Yapabilirsiniz");
//        } else if (sicaklik >= 5 && sicaklik < 15) {
//            System.out.println("Sinemaya Gidebilirsin");
//        } else if (sicaklik >= 15 && sicaklik < 25) {
//            System.out.println("Pikniğe Gidebilirsin");
//        } else if (sicaklik >= 25) {
//            System.out.println("Yüzmeye Gidebilirsin");
//        }

        String derece = (sicaklik < 5) ? "Kayak Yapabilirsin":
                (sicaklik >= 5 && sicaklik < 15) ?"Sinemaya Gidebilirsin" :
                        (sicaklik >= 15 && sicaklik < 25) ? "Pikniğe Gidebilirsin":
                                (sicaklik >= 25) ? "Yüzmeye Gidebilirsin" : "Kafana Göre Takıl " +
                                        "Derece 25 ten fazla Bence evde otur film izle kafana güneş geçmesin :)";

        System.out.println(derece);



    }
}

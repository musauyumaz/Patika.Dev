import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = (int) (Math.random() * 100);
        number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz");
                if (!isWrong){
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir");
                }else{
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız Kalan Hak" + (5-right));
                }
                continue;
            }

            if (selected == number) {
                isWin = true;
                System.out.println("Tebrikler Doğru Tahmin Tahmin Ettiğin sayi : " + number);
                break;
            } else {
                wrong[right++] = selected;
                System.out.println("Hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı , gizli sayıdan büyüktür");
                } else {
                    System.out.println(selected + " sayısı , gizli sayıdan küçüktür");
                }
                System.out.println("Kalan Hakkı : " + (5 - right));
            }

            if (!isWin && !isWrong==true)
            {
                System.out.println("Kaybettiniz !");
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                System.out.println("Sayımız : " + number);
            }
        }
    }
}

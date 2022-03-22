import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1;
        int k;
        System.out.println("Program Başladı");
        while (i <= 5) {
            System.out.println(i);
            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Program Bitti");

        int left = 100, right = 200;

        while (++left < --right) ;

        System.out.println(right);
        int password;
        boolean isPasswordSuccess = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Şifre Giriniz");
        password = input.nextInt();

        while (!isPasswordSuccess){
            System.out.println("Şifre Giriniz");
            password = input.nextInt();
            if (password == 123){
                System.out.println("Doğru");
                isPasswordSuccess = true;}
            else
                System.out.println("Yanlış");
        }
    }
}

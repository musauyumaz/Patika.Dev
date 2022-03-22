import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        int year =2021;
        int pass;
        boolean askPassword = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(year);
        }while (year<2021);


        do {
            System.out.print("Şifre Giriniz: ");
            pass = input.nextInt();
            if (pass == 123) {
                askPassword = false;
                System.out.println("Doğru");
            }else
                System.out.println("Yanlış");
        }while(askPassword);
    }
}

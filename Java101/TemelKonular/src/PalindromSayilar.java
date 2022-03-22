import java.util.Scanner;

public class PalindromSayilar {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Değer Giriniz : ");
        sayi = input.nextInt();
        isPalindrom(sayi);
    }

    static boolean isPalindrom(int number) {
        int tempNumber = number, reverseNumber = 0, lastNumber;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);
            tempNumber /= 10;
            //System.out.println("Yeni Temp =>" + tempNumber);
        }
        if (reverseNumber == number) {
            System.out.println(number + " Palindrom Sayıdır");
            return true;
        } else {
            System.out.println(number + " Palindrom Sayı Değildir");
            //System.out.println(reverseNumber);
            //System.out.println(number);
            return false;
        }
    }
}

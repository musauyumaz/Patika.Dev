import java.util.Arrays;
import java.util.Scanner;

public class DiziGirilenSayiyaYakinSayilar {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        yakinSayilar(numbers, sayi);

    }

    static void yakinSayilar(int[] sayilar, int sayi) {
        int[] newArray = Arrays.copyOf(sayilar, sayilar.length + 1);
        newArray[newArray.length - 1] = sayi;
        Arrays.sort(newArray);
        Arrays.sort(sayilar);
        int index = Arrays.binarySearch(newArray, sayi);
        int minYakinDeger = 0, maxYakinDeger = 0;

        if (index == 0) {
            maxYakinDeger = newArray[index + 1];
            System.out.println("Lütfen array aralığında olabilecek bir sayı giriniz sadece Max Yakın Değeri bulabildik");
            System.out.println("Sıralı Dizi : " + Arrays.toString(sayilar));
            System.out.println("Girilen Sayı :" +sayi);
            System.out.println("Girilen sayıdan büyük en yakın sayı :" + maxYakinDeger);
        }
        if (index == newArray.length-1) {
            minYakinDeger = newArray[index - 1];
            System.out.println("Lütfen array aralığında olabilecek bir sayı giriniz sadece Min Yakın Değeri bulabildik");
            System.out.println("Sıralı Dizi : " + Arrays.toString(sayilar));
            System.out.println("Girilen Sayı :" +sayi);
            System.out.println("Girilen sayıdan küçük en yakın sayı :" + minYakinDeger);



        }
        else {
            minYakinDeger = newArray[index - 1];
            maxYakinDeger = newArray[index + 1];
            System.out.println("Sıralı Dizi : " + Arrays.toString(sayilar));
            System.out.println("Girilen sayıdan küçük en yakın sayı :" + minYakinDeger);
            System.out.println("Girilen sayıdan büyük en yakın sayı :" + maxYakinDeger);
        }
    }

}

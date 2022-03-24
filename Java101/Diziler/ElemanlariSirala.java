import java.util.Arrays;
import java.util.Scanner;

public class ElemanlariSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int diziuzunlugu = input.nextInt();
        int[] sayilar = new int[diziuzunlugu];
        for (int i=0;i<diziuzunlugu;i++){
            System.out.print((i+1)+". Elamanı : ");
            sayilar[i]=input.nextInt();
        }
        System.out.println("Girilen Sayılar :"+Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println("Sıralama :"+Arrays.toString(sayilar));
    }
}

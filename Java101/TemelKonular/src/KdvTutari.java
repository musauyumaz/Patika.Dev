import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        float kdv =0.18f,alinanPara,kdvTutari,kdvliTutar=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fiyatını Giriniz: ");
        alinanPara = input.nextFloat();
        System.out.println("KDV'siz Fiyat: "+alinanPara+" ₺");
        boolean deger = alinanPara>=1000;

        kdv = deger ? 0.08f : 0.18f;
        kdvTutari  = kdv * alinanPara;
        System.out.println("KDV Tutarı :"+kdvTutari +" ₺ --> KDV Orani: "+kdv);
        kdvliTutar +=(alinanPara * kdv)+alinanPara;

        System.out.println("KDV'li Tutar: "+kdvliTutar+" ₺");





    }
}

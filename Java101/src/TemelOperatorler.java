public class TemelOperatorler {
    public static void main(String[] args) {
//        ******* Atama Operatörleri *******
        int a =7 , b=1;
        b = b+a;
        b+=a;
        b-=a;
        b*=a;
        b/=a;
        b%=a;
        System.out.println(b);

//        ****** Aritmetiksel Operatörler ********
        int c=5,d=2;
        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c-d);
        System.out.println(c%d);

//        ******* İlişkisel ve Eşitlik Operatörler *******
        int e=5,f=1;
        boolean sonuc =(e==f);
        sonuc =(e!=f);
        sonuc =(e>=f);
        sonuc =(e<=f);
        System.out.println(sonuc);

//       ******** Mantıksal Operatörler ************
        int g =5, h=6, j=5;
        boolean kosul1 = g==h;
        boolean kosul2 = g>=h;
        boolean sonuc1 = kosul1 && kosul2;
        sonuc1 = kosul1 || kosul2;
        boolean sonuc2 = !((g==j) || (g>=h));
        System.out.println(sonuc);
        System.out.println(sonuc2);


//        ******** Mantıksal Operatörler ************
        String str = (sonuc) ? "Doğru" : "Değil";
        int result = sonuc ? 1:2;
    }
}

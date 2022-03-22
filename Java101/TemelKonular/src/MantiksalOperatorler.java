public class MantiksalOperatorler {
    public static void main(String[] args) {
        int a=10 ,b=20,c=5;
        c =(a==b) ? 2 : 3;
        boolean kosul1 = (a<b);
        boolean kosul2 = (a>c);
        boolean sonuc = kosul1 && kosul2;
        System.out.println(!sonuc);
    }
}

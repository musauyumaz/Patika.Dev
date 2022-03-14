public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a =5,b=10;
        System.out.println(a<=b);

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40 ;

        // == Operatörü
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(C == D);

        // !=  Eşit Değil Operatörü

        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(C != B);

        // > Büyüktür Operatörü

        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);

        // >= Büyük-Eşittir Operatörü

        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);

        // <  Küçüktür Operatörü

        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);


        // <= Küçük-Eşittir Operatörü

        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);
    }
}

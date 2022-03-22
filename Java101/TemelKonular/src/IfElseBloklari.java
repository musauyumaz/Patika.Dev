public class IfElseBloklari {
    public static void main(String[] args) {
//        int a = 10, b = 20;
//        boolean compare = a == b;
//        String str = compare ? "Eşittir" : "Eşit Değildir";
//        System.out.println(compare);
//
//        if (compare) {
//            a = 50;
//            System.out.println("A Sayısı: " + a);
//            System.out.println("Eşittir");
//        } else {
//            System.out.println("Eşit Değildir");
//        }
//        System.out.println("Program Bitti");
        int a = 10, b = 20, c = 100;
        if (a < b && a < c) {
            System.out.println("A En Küçük Sayıdır");
        } else if (b < a && b < c) {
            System.out.println("B En Küçük Sayıdır");
        } else if (c < a && c < b) {
            System.out.println("C En Küçük Sayıdır");
        }


    }
}

public class RecursiveUsluSayi {
    public static void main(String[] args) {
        System.out.println(usBul(2, 9));
    }

    static float usBul(float sayi, int us) {
        if (us <= 0)
            return 1;
        return usBul(sayi, us - 1) * sayi;
    }
}

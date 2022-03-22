public class RecursiveDesen {
    public static void main(String[] args) {
        sayiDesen(25);
    }

    static int sayiDesen(int sayi) {
        int tempSayi = sayi;
        if (sayi >= 0) {
            System.out.println(sayi);
            return sayiDesen(sayi - 5);
        } else if (sayi <= 0) {
            if (sayi >= tempSayi) {
                return sayi;
            }
            System.out.println(sayi);
            return sayiDesen(sayi + 5);
        } else {
            return sayi;
        }
    }
}

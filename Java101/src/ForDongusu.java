public class ForDongusu {
    public static void main(String[] args) {
        for (int i = 3; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        int k = 3;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }

        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println("Sum :"+sum);
    }
}

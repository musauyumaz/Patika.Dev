public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i nin değeri 5'tir");
                break;
            }
            System.out.println(i);
        }
        System.out.println("**********Continue************");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("**********************");
        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
    }
}

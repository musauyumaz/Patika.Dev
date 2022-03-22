public class RecursiveMetotlar {
    public static void main(String[] args) {
        sum(8);
    }

    static int sum(int n) {
        System.out.println("n => "+n);
        if (n == 1)
            return 1;
        int result = sum(n - 1) + n;
        System.out.println("Result => " +result);
        return  result;
    }
}

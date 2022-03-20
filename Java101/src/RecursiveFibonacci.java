public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    static int Fibonacci(int n) {
        if (n ==2 ||n ==1)
        {
            return 1;
        }
        return Fibonacci(n - 1) +Fibonacci(n-2);
    }
}

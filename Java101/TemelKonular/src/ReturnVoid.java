public class ReturnVoid {
    public static void main(String[] args) {
        int result = sum(5, 2) +sum(3,1);
        System.out.println(result);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static void sum1(int a,int b)
    {
        int result = a+b;
        System.out.println(result);
    }

}

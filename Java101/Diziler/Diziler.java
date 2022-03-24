public class Diziler {
    public static void main(String[] args) {
        int[] list = new int[10];
        int list2[] = new int[10];
        int list3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

//        for (int i=0;i<list3.length;i++){
//            System.out.println(list3[i]);
//        }
//        list[0] = 10;
//        list[1] = 20;
//        list[2] = 30;
//        list[1] = 20;
//        for (int i = 0; i < list.length; i++) {
//            list[i] = (i * 10) + 10;
//            System.out.println(list[i]);
//        }
//        System.out.println(list[-1]);

        double list4[] = {1.1,2.2,3.3};
        printArray(reverse(list3));

    }
    static void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] reverse(int[] list)
    {
        int[] reverse = new int[list.length];
        for (int i=0,j=list.length-1; i<list.length;i++,j--){
            reverse[i] = list[j];
        }
        return reverse;
    }
}

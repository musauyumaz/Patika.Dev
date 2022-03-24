public class DizidekiMaksimumveMinimumDegerleriBulanProgram {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min =0;
        int max =0;

        for(int i =0;i<list.length;i++)
        {
            if (list[i]<min)
                min = list[i];
            if (list[i]>max)
                max = list[i];
        }

        System.out.println("Minimum Değer : " + min);
        System.out.println("Maximum Değer : " + max);
    }


}

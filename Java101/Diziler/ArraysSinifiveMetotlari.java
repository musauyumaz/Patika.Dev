import java.util.Arrays;

public class ArraysSinifiveMetotlari {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
        int[] list2 = {5,67,78,2,13,1};
//        HelperArray helper = new HelperArray();
//        helper.print(list);

        //*************** fill ******************
        Arrays.fill(list,2,7,10);


        //*************** toString ******************
        System.out.println(Arrays.toString(list));


        //*************** sort ****************** Küçükten => Büyüğe
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        //*************** binarySearch ******************
        System.out.println(HelperArray.search(liste,55));
        System.out.println(Arrays.binarySearch(liste,27));

        //*************** copyOf copyOfRange ******************
        int[] liste2 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        //Arrays.sort(liste2);

        int[] copyList = Arrays.copyOf(liste2,4);
        System.out.println(Arrays.toString(copyList));
        int[] copyList2 = Arrays.copyOfRange(liste2,4,9);
        System.out.println(Arrays.toString(copyList2));


        //*************** equals ******************
        int[] lis1 = {1,2,3};
        int[] lis2 = {1,2,3};
        int[] lis3 = {3,5,3};

        System.out.println(Arrays.equals(lis1,lis2));
    }

}

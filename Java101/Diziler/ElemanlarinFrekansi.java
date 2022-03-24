import java.util.Arrays;

public class ElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 20, 10, 10, 20, 5, 20};
        frekansBul(sayilar);
    }

    private static void frekansBul(int[] list) {
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        int frekans = 1;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j]) && i != j) {
                    frekans++;
                    System.out.println(frekans);
                }
                if (isFind(duplicate, list[i])) {
                    duplicate[startIndex++] = list[i];
                    System.out.println(list[i] + " sayisi " + frekans + " kere tekrar edildi");
                }
            }
            frekans = 0;
        }

    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }


}

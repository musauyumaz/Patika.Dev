import java.util.Arrays;

public class TekrarEdenSayiyiBul {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 2, 9, 10, 21, 1, 33, 9, 1,2};
        System.out.println("Tekrar Eden Sayilar");
        tekrarEdenSayilar(list);
        System.out.println("Tekrar Eden Çift Sayilar");
        tekrarEdenCiftSayilar(list);

    }

    private static void tekrarEdenSayilar(int[] list) {
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    static void tekrarEdenCiftSayilar(int[] arr) {
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (isFind(duplicate, arr[i]) && ciftmi(arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

    static boolean ciftmi(int sayi) {
        if (sayi % 2 == 0)
            return true;
        else
            return false;
    }
}

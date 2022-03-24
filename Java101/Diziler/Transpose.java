import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] sayilar = {
                {2, 3, 4},
                {5, 6, 4}};
        int[][] sayilar2 =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20},

                };
        transpose(sayilar);
        System.out.println();
        transpose(sayilar2);
    }

    static void transpose(int arr[][]) {
        int[][] newArr = new int[arr[arr.length - 1].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        for (int[] row : newArr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

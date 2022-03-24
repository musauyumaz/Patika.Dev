public class DiziElemanlariOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        int[] numbers = {15, 6, 7, 12, 7, 9, 3  };
        int sum = 0;
        float ortalama;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        ortalama = (float) sum / numbers.length;
        System.out.println(ortalama);
    }
}

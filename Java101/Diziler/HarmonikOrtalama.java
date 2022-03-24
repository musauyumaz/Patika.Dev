public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {15, 6, 7, 12, 7, 9, 3};
        double toplam = 0, ortalama;
        for (int i = 0; i < numbers.length; i++) {
            toplam += (float) (1.0 / numbers[i]);
        }

        ortalama = numbers.length / toplam;
        System.out.println("Sonuç : " + toplam);
        System.out.println("Ortalama : " + ortalama);


    }

}

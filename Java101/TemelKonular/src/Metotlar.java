public class Metotlar {
    public static void main(String[] args) {

        usAl(2, 6);
        helloWorld();
    }

    static void usAl(int sayi, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++)
            sonuc *= sayi;
        System.out.println(sonuc);
    }
    static  void helloWorld()
    {
        System.out.println("Merhaba Dünya!");
    }
}

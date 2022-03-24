public class CokBoyutluDiziBHarfiYazdir {
    public static void main(String[] args) {


        aHarfiYazdir();


        bHarfiYazdir();
    }

    private static void aHarfiYazdir() {
        System.out.println("******************** A Harfi ********************");
        String[][] aHarfi = new String[6][4];

        for (int i = 0; i < aHarfi.length; i++) {
            for (int j = 0; j < aHarfi[i].length; j++) {
                if (i == 0 || i == 2) {
                    aHarfi[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    aHarfi[i][j] = " * ";
                } else
                    aHarfi[i][j] = "   ";
            }
        }

        for (String[] row : aHarfi) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void bHarfiYazdir() {
        System.out.println("******************** B Harfi ********************");
        String[][] bHarfi = new String[7][4];

        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                if (i == 0 || i == 6 || i == 3) {
                    bHarfi[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    bHarfi[i][j] = " * ";
                } else
                    bHarfi[i][j] = "   ";
            }
        }

        for (String[] row : bHarfi){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

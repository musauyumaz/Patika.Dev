public class SwitchCaseYapisi {
    public static void main(String[] args) {
        int day = 1;
        if (day == 1) {
            System.out.println("Bugüm Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugüm Salı");
        } else if (day == 3) {
            System.out.println("Bugüm Çarşamba");
        } else if (day == 4) {
            System.out.println("Bugüm Perşembe");
        } else if (day == 5) {
            System.out.println("Bugüm Cuma");
        } else if (day == 6) {
            System.out.println("Bugüm Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugüm Pazar");
        } else {
            System.out.println("Hatalı Giriş Yaptınız");
        }

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                System.out.println("Program Bitti");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                System.out.println("Program Bitti");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                System.out.println("Program Bitti");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                System.out.println("Program Bitti");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                System.out.println("Program Bitti");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                System.out.println("Program Bitti");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
        }
    }
}

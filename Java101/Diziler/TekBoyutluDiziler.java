public class TekBoyutluDiziler {
    public static void main(String[] args) {
        double[] list1 = new double[5];
        list1[0] =4.1;

        String[] days ={"Pazartesi","Salı","Çarşamba"};
        days[0] = "Persembe";
        String[] weekendDays ={"Cumartesi","Pazar"};

        System.out.println(days.length);

        for (int i =0;i< days.length;i++)
        {
            System.out.println(days[i]);
        }

    }
}

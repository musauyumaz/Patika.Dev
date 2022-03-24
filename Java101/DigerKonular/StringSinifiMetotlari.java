import java.util.Locale;

public class StringSinifiMetotlari {
    public static void main(String[] args) {
        String str = "patika.dev";
        String patika ="paTİka";
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointAt(1));
        System.out.println(str.compareTo(patika));
        System.out.println(str.compareToIgnoreCase(patika));
        System.out.println(str.concat("dev"));
        System.out.println(str.contains("ata"));
        System.out.println(str.equals("patiKA"));
        System.out.println(str.equalsIgnoreCase("patiKA"));
        System.out.println(str.indexOf("k"));
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.length());
        System.out.println(str.replace("a","b"));
        System.out.println(str.replaceFirst("a","b"));
        System.out.println(str.replaceAll("a","b"));
        System.out.println(str.split("a"));
        System.out.println(str.startsWith("aa"));
        System.out.println(str.substring(2,6));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.valueOf(0));
    }
}

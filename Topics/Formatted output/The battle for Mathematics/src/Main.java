import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        String formatNum = String.format("%.3f", pi);
        System.out.println(formatNum);


    }
}
package module02.lesson08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    /**
     * You have such string as "12 var3 34 2%^i 90".
     *
     * Create method that allows to get all numbers from this string.
     * Create method that allows you to get all the numbers from the words of this string, which contains only numbers.
     */

    private static String st = "12 var3 34 2%^i 90";

        public static void main(String[] args) {

            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(st);
            while (matcher.find()){
                System.out.println(matcher.group());
            }

            System.out.println("-----------------");

            Pattern pattern1 = Pattern.compile("\\b[0-9]+[^%]\\b");
            Matcher matcher1 = pattern1.matcher(st);
            while (matcher1.find()){
                System.out.println(matcher1.group());
            }
    }
}
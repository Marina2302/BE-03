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

            String delim = " ";
            String[] subStr = st.split(delim);
            for(int i = 0; i < subStr.length; i++) {
                Pattern pattern1 = Pattern.compile("^[0-9]+$");
                Matcher matcher1 = pattern1.matcher(subStr[i]);
                while (matcher1.find()){
                    System.out.println(matcher1.group());
                }
            }
    }
}

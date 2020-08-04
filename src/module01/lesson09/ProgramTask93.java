package module01.lesson09;

import java.sql.SQLOutput;

public class ProgramTask93 {
    public static void main(String[] args) {
        /**
         * Enter 2 words consisting of an even number of letters.
         * Get a word consisting of the first half of the first word and the second half of the second word.
         */
        String s1 = "Hedgerow";
        String s2 = "Spacehog";
        System.out.println(s1.substring(0,4) + s2.substring(4,8));
    }
}

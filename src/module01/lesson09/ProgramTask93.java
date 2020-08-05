package module01.lesson09;

import java.util.Scanner;

public class ProgramTask93 {
    public static void main(String[] args) {
        /**
         * Enter 2 words consisting of an even number of letters.
         * Get a word consisting of the first half of the first word and the second half of the second word.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 words consisting of an even number of letters:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() % 2 == 0 && s2.length() % 2 == 0) {
            System.out.println(s1.substring(0, s1.length() / 2) + s2.substring(s2.length() / 2, s2.length() + 0));
        } else {
            System.out.println("You entered a word or words with an odd number of letters.");
        }
    }
}

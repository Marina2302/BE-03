package module01.lesson09;

import java.util.Scanner;

public class ProgramTask94 {
    public static void main(String[] args) {
        /**
         * Create a method which can reverse any string and demonstrate it in the main method using Scanner.
         */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        reverse(s1);
    }

    public static void reverse(String s1){
        StringBuilder s = new StringBuilder(s1);
        System.out.println(s.reverse());
    }
}

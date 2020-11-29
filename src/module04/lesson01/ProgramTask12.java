package module04.lesson01;

import java.util.Scanner;

/**
 * Count the number of commas (",") in the text received from the console.
 */
public class ProgramTask12 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (char c : sc.nextLine().toCharArray()) {
            if (c == ',') {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}

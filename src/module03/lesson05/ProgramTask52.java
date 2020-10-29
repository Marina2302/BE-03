package module03.lesson05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Enter from the console a string that contains only Latin letters, spaces, punctuation marks and dashes.
 * Sort letters alphabetically and display the first 5 different letters on one line without separators.
 * If the string contains less than 5 different letters, print them all.
 * Letters of different case are considered the same.
 * The case of the letters displayed does not affect the result.
 * Use TreeSet.
 * Example 1 input: zBk yaz b-kN
 * Example 1 output: abkny
 * Example 2 input: caAC A, aB? bB
 * Example 2 output: abc
 */
public class ProgramTask52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Character> letters = new TreeSet<>();
            String s = sc.nextLine().toLowerCase().replaceAll("[^\\p{Alpha}]", "");
            for (int i = 0; i < s.length(); i++) {
                letters.add(s.charAt(i));
            }

        Iterator<Character> iterator = letters.iterator();
        int n = letters.size() < 5 ? letters.size() : 5;

        for (int i = 0; i < n; i++) {
            System.out.print((iterator.next()));
        }
    }
}

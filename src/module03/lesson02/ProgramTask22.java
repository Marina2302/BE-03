package module03.lesson02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTask22 {
    /**
     * Create a list of strings.
     * Add 10 strings to this list using console. (The strings must have different length and must be entered in random order).
     * Find out which line appears first in the list: the shortest or the longest.
     * Display this string.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int minLenInd = 0;
        int maxLenInd = 0;
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
            if (list.get(minLenInd).length() > list.get(i).length()) {
                minLenInd = i;
            }
            if (list.get(maxLenInd).length() < list.get(i).length()){
                maxLenInd = i;
            }
        }
        sc.close();
        if(minLenInd < maxLenInd){
            System.out.println(list.get(minLenInd));
        }else {
            System.out.println(list.get(maxLenInd));
        }
        System.out.println(list);
    }
}

package module01.lesson07;

import java.util.Scanner;

public class ProgramTask76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        boolean duplicated = false;
        for (int j = 0; j < y.length(); j++) {
            for (int k = j + 1; k < y.length(); k++) {
                if (k != j && y.charAt(k) == y.charAt(j)) {
                    duplicated = true;
                    System.out.println("Yes");
                    break;
                }
            }
            if (duplicated)
                break;
        }
        if (!duplicated)
            System.out.println("No");
    }
}

package module01.lesson07;

import java.util.Scanner;

public class ProgramTask72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i * i <= N) {
            System.out.println(i * i);
            i++;
        }
    }
}

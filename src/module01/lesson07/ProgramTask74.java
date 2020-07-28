package module01.lesson07;

public class ProgramTask74 {
    public static void main(String[] args) {
        int m = 7;
        int w = 0;
        while (w < m) {
            for (int i = 0; i < m - w; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < w * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            w++;
        }
    }
}

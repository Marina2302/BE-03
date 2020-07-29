package module01.lesson07;

public class ProgramTask77 {
    public static void main(String[] args) {
        int n = 10_000_000;
        double k = 1.014 - 0.008;
        for (int y = 1; y <= 10; y++) {
            n = (int) (n * k);
        }
        System.out.println(n);
    }
}

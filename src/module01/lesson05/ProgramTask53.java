package module01.lesson05;

public class ProgramTask53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;

        if (a >= b && a >= c) {
            System.out.println("Максимальное число - " + a);
        } else if (b >= c) {
            System.out.println("Максимальное число - " + b);
        } else {
            System.out.println("Максимальное число - " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("Минимальное число - " + a);
        } else if (b <= c) {
            System.out.println("Минимальное число - " + b);
        } else {
            System.out.println("Минимальное число - " + c);
        }
    }
}

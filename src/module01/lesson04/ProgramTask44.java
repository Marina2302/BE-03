package module01.lesson04;

public class ProgramTask44 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        compare(a, b);

        a = 5;
        compare(a, b);
        // Variable a has the same value as variable b.
        // Therefore all comparison results have changed

        //boolean
        boolean c = a != b;
        System.out.println(c);
    }

    private static void compare(int a, int b) {
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}

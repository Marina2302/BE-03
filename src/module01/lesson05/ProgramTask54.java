package module01.lesson05;

public class ProgramTask54 {
    public static void main(String[] args) {
        int a = 10;
        int c = a;
        int b = ++a;
        if (b >= a) {
            if (c == 10) {
                if ((c <= b) && (a != b)) {
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

        // One of the statements isn't true. will be displayed on the console as a result
        // if (b > a) - All statements are false
        // if (c < 10) - One of statements is true.
        // if ((c <= b) && (a == b)) - All statements are true.
    }
}

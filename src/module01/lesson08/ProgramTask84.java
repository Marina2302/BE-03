package module01.lesson08;

public class ProgramTask84 {
    static int i = 0;
    public static void main(String[] args) {
        rec(5);
    }

    /**
     * Write a method that takes an integer parameter and displays numbers from 0 to the parameter.
     * Use recursion. Call it in the main method.
     */
    public static void rec(int x) {
        System.out.println(i);
        if (i == x) {
            return;
        }
        i++;
        rec(x);
    }

    // What does recursion compare to? - closed loop
    // What error can the careless use of recursion cause? - StackOverflowError
}

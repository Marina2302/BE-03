package module01.lesson08;

public class ProgramTask82 {
    public static void main(String[] args) {
        System.out.println(compare(-2));
        System.out.println("----------");
        System.out.println(compareS(5));
        System.out.println("----------");
        compareN(-7);
    }

    /**
     * Write a method with one parameter that will return true if the number is greater than zero, otherwise it will return false.
     * In the main method, call it and display it. Experiment with different parameters.
     */
    public static boolean compare(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    /**
     * Write a method with one parameter that will call the method from the previous job and, if true, return the string:
     * "number is greater than zero", otherwise the string "number is zero or less".
     * In the main method, call it and display it.
     * Experiment with different parameters.
     */
    public static String compareS(int x) {
        if (compare(x)) {
            return "number is greater than zero";
        }
        return "number is zero or less";
    }

    /**
     * Write a method with one parameter that will call the method from the previous job and additionally return a number.
     * Example (number is greater than zero and equal to 10) In the main method, call it and display it.
     * Experiment with different parameters.
     */
    public static void compareN(int x) {
        System.out.println(compareS(x) + " and equal to " + x);
    }
}

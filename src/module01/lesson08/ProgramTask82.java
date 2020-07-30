package module01.lesson08;

public class ProgramTask82 {
    public static void main(String[] args) {
        System.out.println(compare(-2));
        System.out.println("----------");


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

}

package module01.lesson08;

public class ProgramTask83 {
    public static void main(String[] args) {
        multiplication(5);
        multiplication(2, 5);
        multiplication(2.0, 5);
        multiplication(2.0, 5.0);
        int[] a = {1, 2, 3, 4};
        multiplication(a);
    }

    /**
     * Write multiplication methods using overloading.
     * Call all of these methods in the main method.
     */
    // With one integer parameter.
    public static int multiplication(int x) {
        return x * x;
    }

    // With two integer parameters.
    public static int multiplication(int x, int y) {
        return x * y;
    }

    // With one double parameter and one integer parameter.
    public static double multiplication(double y, int x) {
        return x * y;
    }

    // With two double parameters.
    public static double multiplication(double y, double x) {
        return x * y;
    }

    // With an integer array.
    public static int multiplication(int[] x) {
        int z = 1;
        for (int i = 0; i <= x.length - 1; i++) {
            z = x[i] * x[i];
        }
        return z;
    }

    // What is method overloading? - is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
    // How to overload a method? - change the data type in the parameters, change the number of parameters or their sequence
    // Is this a method overload?
    //   public static void sum(int a, double b) {
    //      ...
    //   }  No
    //
    // And this?
    //   public static double sum(double a, int b) {
    //      ...
    //   }
    // Yes
}

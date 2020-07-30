package module01.lesson08;

public class ProgramTask81 {
    public static void main(String[] args) {
        display();
        System.out.println("----------");
        sum(2);
        System.out.println("----------");


    }

    /**
     * Write a method with no parameters that displays numbers from 1 to 20.
     * Even on the right, odd on the left. Call it in the main method.
     */
    public static void display() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " " + ++i + "\n");
        }
    }

    /**
     * Write a method with one parameter that will output the sum of numbers from 1 to the given parameter.
     * Call it in the main method.
     */
    public static void sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

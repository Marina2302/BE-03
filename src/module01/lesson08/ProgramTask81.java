package module01.lesson08;

public class ProgramTask81 {
    public static void main(String[] args) {
        display();
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
}

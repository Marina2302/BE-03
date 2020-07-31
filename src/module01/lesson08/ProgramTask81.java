package module01.lesson08;

public class ProgramTask81 {
    public static void main(String[] args) {
        display();
        System.out.println("----------");
        sum(2);
        System.out.println("----------");
        div(2, 11);
        System.out.println("----------");
        triangle(2,2, 3);
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

    /**
     * Write a method with two parameters that will print all numbers from the first parameter to the second parameter,
     * which are divisible by 3. Call it in the main method.
     */
    public static void div(int x, int y) {
        for (int a = x; a <= y; a++) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }
    }

    /**
     * Write a method with three parameters that will deduce whether such a triangle is possible.
     * (Tip: For a triangle, the sum of any two sides must be greater than the third.)
     * Call it in the main method.
     */
    public static void triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("A triangle with such sides is possible");
        } else {
            System.out.println("A triangle with such sides is not possible");
        }
    }
}

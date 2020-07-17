package module01.lesson04;

public class ProgramTask43 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        a++;
        b--;
        System.out.println(a + "\n" + b);
        a = --b;
        System.out.println(a + "\n" + b);
        a = b--;
        System.out.println(a + "\n" + b);
        // In the first case, variable b was immediately subtracted 1,
        // and then the resulting value was assigned to variable a.
        // In the second case, the value of variable b was immediately assigned to variable a,
        // and then it was subtracted 1.
        // This happened due to the difference between the pre-decrement and the post-decrement.


        // pre-increment (increment x first, then calculating x)
        // means that the increment x is first executed (the value of the variable is increased by 1),
        // and then the new value of the variable is saved

        // post-increment (first calculate x, then increment x)
        // means that the value of the variable is stored first,
        // and then the increment x is executed.

        // pre-decrement (first decrement x, then calculate x)
        // means that the decrement x is first executed (the value of the variable decreases by 1),
        // and then the new value of the variable is saved

        // post-decrement (first calculate x, then decrement x)
        // means that the value of the variable is stored first,
        // and then the decrement x is executed.
    }
}

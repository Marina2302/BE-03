package module01.lesson04;

public class ProgramTask46 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(a ^ b);

        // The bitwise operators are like logical operators
        // After applying the NOT (~) operator, the bits of the number are reversed (0 changes to 1, and 1 changes to 0)
    }
}

package module01.lesson04;

public class ProgramTask47 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a << 1);
        System.out.println(a >> 1);

        a = -5;
        System.out.println(a >>> 1);

        // Because the bit representation of the number has changed, now this representation corresponds to the number 2147483645

        // >> The value of the right operands moves to the right by the number of bits specified by the left operand.
        // >>> The value of the left operands moves to the right by the number of bits specified by the right operand, and the shifted values are filled with zeros.
    }
}

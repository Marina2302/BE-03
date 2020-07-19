package module01.lesson04;

public class ProgramTask45 {
    public static void main(String[] args) {
        boolean bOne = true;
        boolean bTwo = false;
        compare(bOne, bTwo);

        bTwo = true;
        compare(bOne, bTwo);

        // boolean
        // The precedence of NOT ! is the highest of all logical operators, so it always executes first
        // && is the same as &, but if the operand to the left of & is false, this operator returns false without checking the second operand.
        // || this is the same as |, but if the operator on the left is true, the operator returns true without checking the second operand.

        // true || false - true
        // false && true - false
        // !true || 1 >= 0 - true
        // false && 5 - not valid
        // true &&! false - true
        // true ^! true - true
        // 1>= 1 || false - true
        // true && 5 - 5 - not valid
    }

    private static void compare(boolean bOne, boolean bTwo) {
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);
        System.out.println(!bOne);
        System.out.println(bOne ^ bTwo);
    }
}

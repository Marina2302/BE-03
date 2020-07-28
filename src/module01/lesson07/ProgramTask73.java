package module01.lesson07;

public class ProgramTask73 {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int x : array) {
            mul *= x;
        }
        System.out.println(mul);
    }
}

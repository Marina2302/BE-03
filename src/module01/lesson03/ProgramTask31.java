package module01.lesson03;

public class ProgramTask31 {
    public static void main(String[] args) {
        // 8 bits (In practice, these values can vary depending on the Virtual Machine implementation.)
        // -128...127
        byte a = 127;
        byte b = (byte) 255;
        byte c = (byte) (a - b);
    }
}

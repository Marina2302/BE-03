package module01.lesson03;

public class ProgramTask32 {
    public static void main(String[] args) {
        // 16 bits (In practice, these values can vary depending on the Virtual Machine implementation.)
        // -32768...32767
        short a = -32768;
        short b = (short) 32768;
        short c = (short) (a + b);
    }
}

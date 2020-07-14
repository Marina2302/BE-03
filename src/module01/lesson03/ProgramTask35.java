package module01.lesson03;

public class ProgramTask35 {
    public static void main(String[] args) {
        // float 32 bits (In practice, these values can vary depending on the Virtual Machine implementation.)
        // 1.4e-45...3.4028235e38
        // double 64 bits (In practice, these values can vary depending on the Virtual Machine implementation.)
        // 4.9e-324...1.7976931348623157e308
        float A = 1245.554f;
        double B = 256.3785;
        System.out.println((A * B) % 1);
    }
}

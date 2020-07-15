package module01.lesson03;

public class ProgramTask38 {
    public static void main(String[] args) {
        // Convert the decimal number 123 to a number system: binary, octal, hexadecimal

        // 123/2 = 61 (1)
        // 61/2 = 30 (1)
        // 30/2 = 15 (0)
        // 15/2 = 7 (1)
        // 7/2 = 3 (1)
        // 3/2 = 1 (1)
        // 1/2 = 0 (1)
        int num123b = 0b1111011; // число 123 в двоичной системе счисления

        // 123/8 = 15 (3)
        // 15/8 = 1 (7)
        // 1/8 = 0 (1)
        int num123 = 0173; // число 123 в восьмеричной системе счисления

        // 123/16 = 7 (11)
        // 7/16 = 0 (7)
        int num123x = 0x7b; // число 123 в шестнадцатеричной системе счисления
    }
}

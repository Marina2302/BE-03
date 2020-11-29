package module04.lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Change the behavior of "System.in". This command should get the information from the string or byte array, not from the console.
 */
public class ProgramTask11 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()).length() != 0)
            System.out.println(s);
    }
}

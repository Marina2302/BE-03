package module01.lesson06;

import java.util.Arrays;

public class ProgramTask62 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        int temp;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n / 2; i++) {

            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

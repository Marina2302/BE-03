package module01.lesson06;

import java.util.Arrays;

public class ProgramTask62 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        int[] reverse = new int[n];

        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse));
    }
}

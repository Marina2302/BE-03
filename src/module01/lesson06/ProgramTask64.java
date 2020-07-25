package module01.lesson06;

import java.util.Arrays;

public class ProgramTask64 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array, 1, 3);
        swap(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        swap(array2, 2, 3);
        swap(array2, 4, 5);
        swap(array2, -2, 0);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        if (indexA < 0 || array.length < (indexA + 1)) {
            System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
            System.out.println("IndexA (" + indexA + ") incorrect!" + "\n");
            return;
        }
        if (indexB < 0 || array.length < (indexB + 1)) {
            System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
            System.out.println("IndexB (" + indexB + ") incorrect!" + "\n");
            return;
        }
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        int buf = array[indexB];
        array[indexB] = array[indexA];
        array[indexA] = buf;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}

package module03.lesson03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Armstrong number = a natural number, which in a given number system is equal to the sum of its digits raised to a power equal to the number of its digits.
 * S consists of M digits, for example S = 370 and M (number of digits) = 3.
 * Implement the logic of the getNumbers method, which should be less than N (long) among natural numbers find all numbers that meet the following criteria:
 * the number S is equal to the sum of its digits raised to the M power.
 * getNumbers should return all such numbers in ascending order.
 * Requirements:
 * 1. The Solution class must have a public static long[] getNumbers (long N) method.
 * 2. The getNumbers method should not throw any exceptions for any input.
 * 3. All found numbers must be strictly less than N.
 * 4. The getNumbers method should return an array of numbers satisfying the condition of the problem.
 */
public class Armstrong {
    public static void main(String[] args) {
       long[] numbers = getNumbers(1000);
       System.out.println(Arrays.toString(numbers));
    }

    public static long[] getNumbers(long N) {
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 1; i < N; i++) {
            String s = String.valueOf(i);
            double sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum = Math.pow(Integer.parseInt(s.substring(j, j + 1)), s.length()) + sum;
            }
            if(sum == i){
                list.add(i);
            }
        }
        long[] result = list.stream().mapToLong(l -> l).toArray();
        return result;
    }
}

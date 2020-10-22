package module03.lesson03;

import java.util.ArrayList;
import java.util.Arrays;

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

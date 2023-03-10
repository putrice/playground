package number_sum;

import java.util.Arrays;

public class SumOfTwo {
    private boolean check(int[] arr, int toCheckValue)
    {
        Arrays.sort(arr);

        int res = Arrays.binarySearch(arr, toCheckValue);

        return res >= 0;
    }

    private int[] sum(int[] array, int target) {
        int[] results = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (check(results, array[i])) {
                continue;
            }

            int numTwo = target - array[i];

            if (check(Arrays.copyOfRange(array, i, array.length), numTwo)){
                results[0] = array[i];
                results[1] = numTwo;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        SumOfTwo sumOfTwo = new SumOfTwo();

        int[] test1 = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] result = sumOfTwo.sum(test1, 10);
        System.out.println(Arrays.toString(result));
    }
}

package uncategorized;

import java.util.Arrays;

public class SortedSquaredArray {

    private int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) Math.pow(array[i], 2);
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();

        int[] test = {1, 2, 3, 5, 6, 8, 9};
        int[] result = sortedSquaredArray.sortedSquaredArray(test);
        System.out.println(Arrays.toString(result));
    }
}

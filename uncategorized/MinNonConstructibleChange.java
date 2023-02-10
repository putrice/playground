package uncategorized;

import java.util.Arrays;

public class MinNonConstructibleChange {

    private int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;

        for (int coin : coins) {
            if (coin > change + 1) {
                return change + 1;
            }

            change += coin;
        }


        return change + 1;
    }

    public static void main(String[] args) {
        MinNonConstructibleChange nonConstructibleChange = new MinNonConstructibleChange();
        int[] test = {5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonConstructibleChange.nonConstructibleChange(test));
    }

}

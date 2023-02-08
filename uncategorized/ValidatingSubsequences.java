package uncategorized;

public class ValidatingSubsequences {
    private boolean isValidSubsequence(int[] array, int[] sequence) {
        boolean isValid = false;
        int validCount = 0;

        if (sequence.length <= array.length) {
            for (int a : array) {
                if (sequence[validCount] == a) {
                    validCount++;
                }

                if (validCount == sequence.length) {
                    isValid = true;
                    break;
                }
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        ValidatingSubsequences validatingSubsequences = new ValidatingSubsequences();

        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        System.out.println(validatingSubsequences.isValidSubsequence(array, sequence));
    }

}

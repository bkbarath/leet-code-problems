package easy;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i;
            }

            if (count[i] == 0) {
                result[1] = i;
            }
        }
        System.out.println(Arrays.toString(count));
        return result;
    }
}

package easy;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicateFromArray.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int rd = 0;

        for (int num : nums) {
            if (nums[rd] != num) {
                rd++;
                nums[rd] = num;
            }
        }

        return rd + 1;
    }
}

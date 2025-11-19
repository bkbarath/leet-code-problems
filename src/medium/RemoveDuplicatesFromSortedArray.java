package medium;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int rd = 2;

        if (nums.length <= 2) return nums.length;

        for (int i = 2; i < nums.length; i++) {
            int check = nums[rd - 2];

            if (check != nums[i]) {
                nums[rd] = nums[i];
                rd++;
            }
        }

        return rd;
    }
}

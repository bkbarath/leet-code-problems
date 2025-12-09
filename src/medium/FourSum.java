package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    // Test the fourSum method
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }

    // Time complexity: O(n^3) where n is the length of the array
    // Space complexity: O(k) where k is the number of quadruplets found
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length; // length of the array

        List<List<Integer>> result = new ArrayList<>(); // to store the result

        // sort the array to use two-pointer technique
        Arrays.sort(nums);

        // iterate through the array
        for (int i = 0; i < n; i++) {
            // skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // iterate for the second number
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // two-pointer approach for the remaining two numbers
                int left = j + 1;
                int right = n - 1;
                long newTarget = (long) target - nums[i] - nums[j];

                // find pairs that sum up to newTarget
                while (left < right) {
                    long sum = (long) nums[left] + nums[right];

                    // check if the sum matches the new target
                    if (sum == newTarget) {

                        List<Integer> integers = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        result.add(integers);

                        left++;
                        right--;

                        // skip duplicates for the third and fourth numbers
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right++;

                    } else if (sum < newTarget) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}

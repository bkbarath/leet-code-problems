package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;
                long newTarget = (long) target - nums[i] - nums[j];

                while (left < right) {
                    long sum = (long) nums[left] + nums[right];

                    if (sum == newTarget) {

                        List<Integer> integers = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        result.add(integers);

                        left++;
                        right--;

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

package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // Using the input array itself to mark the presence of numbers
        List<Integer> result = new ArrayList<>();

        // Mark numbers as negative using their value as index
        for (int i = 0; i < nums.length; i++) {
            // Get the index corresponding to the value
            int index = Math.abs(nums[i]) - 1;
            // Mark the number at that index as negative if it's positive
            if (nums[index] > 0) {
                // Mark as negative to indicate presence
                nums[index] = -nums[index];
            }
        }

        // Collect all indices which have positive values, indicating missing numbers
        for (int i = 0; i < nums.length; i++) {
            // If the value is positive, the index + 1 is missing
            if (nums[i] > 0) {
                // i + 1 is missing
                result.add(i + 1);
            }
        }

        // Return the list of missing numbers
        return result;
    }
}

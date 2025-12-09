package easy;

import java.util.Arrays;
import java.util.HashMap;

public class AddTwoSum {

    public int[] twoSum(int[] nums, int target) {
        // for time complexity we can use the hash map to store and get the value if the condition satisfies
        var value = new HashMap<Integer, Integer>();

        // run the loop until the length of the array
        for (int i = 0; i < nums.length; i++) {
            // get x value and find the y value
            // total = x+y => y = total - x
            var diff = target - nums[i];

            // check if the value y is in the map
            if (value.containsKey(diff)) {
                // if yes then return the y's index and x's index
                return new int[]{value.get(diff), i};
            } else {
                // if not then store it into the map
                value.put(nums[i], i);
            }
        }
        // if there is possible value then return empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        AddTwoSum addTwoSum = new AddTwoSum();
        int[] num= new int[]{3,2,4};
        System.out.println(Arrays.toString(addTwoSum.twoSum(num,6)));
    }
}

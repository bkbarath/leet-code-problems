package easy;

// Max Consecutive Ones
public class MaxConsecutiveOnes {

    // function to find max consecutive ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0; // store current count
        int maxCount = 0; // store max count

        // run the loop to the length of the nums
        for (int i = 0; i < nums.length; i++) {
            // check the nums[i] is 1 then add 1 to current
            if (nums[i] == 1) {
                current++;
            } else {
                // if not reset the current value
                current = 0;
            }

            // check current is greater than max then replace else leave it
            if (current > maxCount) {
                maxCount = current;
            }
        }

        return maxCount; // return max count
    }
}

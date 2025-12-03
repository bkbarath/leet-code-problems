package medium;

public class JumpGame {

    // 55. Jump Game
    // https://leetcode.com/problems/jump-game/
    class Solution {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        public boolean canJump(int[] nums) {
            // Greedy Approach
            int max = 0; // furthest reachable index
            int n = nums.length; // length of the array

            // Iterate through each index
            for (int i = 0; i < n; i++) {
                // If the current index is beyond the furthest reachable index, return false
                if (i > max) break;

                // Update the furthest reachable index
                max = Math.max(max, i + nums[i]);

                // If we can reach or exceed the last index, return true
                if (max >= n-1) return true;
            }

            // If we finish the loop without reaching the last index, return false
            return false;
        }
    }
}

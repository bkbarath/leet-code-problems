package medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate2(nums, k);
    }

    // my solution
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] temp = new int[n];
        k = k % n;

        if (k == 0 || n == 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    // o(1) optimized Solution
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    static int[] reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }

        return nums;
    }
}

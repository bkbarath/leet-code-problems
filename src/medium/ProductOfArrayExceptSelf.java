package medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // solution with O(n^2)
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];

        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    value = value * nums[j];
                }
            }
            product[i] = value;
        }

        return product;
    }

    // solution with O(n)
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            product[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            product[i] = product[i] * suffix;
            suffix *= nums[i];
        }


        return product;
    }
}

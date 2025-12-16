package easy;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroFoundAt = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[lastNonZeroFoundAt++] = num;
            }
        }

        for (int i = lastNonZeroFoundAt; i < n; i++) {
            nums[i] = 0;
        }
    }
}



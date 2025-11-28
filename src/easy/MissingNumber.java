package easy;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num: nums) {
            actual += num;
        }

        return expected - actual;
    }
}

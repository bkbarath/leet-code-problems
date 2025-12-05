package medium;

public class IncreasingTriplets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet1(int[] nums) {
        int count = 0;
        int current = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int value = nums[j];
                if (current < value) {
                    current = nums[j];
                    count++;
                }

                if (count >= 3) return true;
            }
        }

        return false;
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int value : nums) {
            if (value <= first) {
                first = value;
            } else if (value <= second) {
                second = value;
            } else return true;
        }

        return false;
    }
}

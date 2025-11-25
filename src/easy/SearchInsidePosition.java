package easy;

public class SearchInsidePosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        if (target > nums[nums.length - 1]) return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}

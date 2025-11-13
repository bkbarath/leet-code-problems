package easy;

public class MajorityElement {

    public static void main(String[] args) {
        int[] num = {3,2,3};
        System.out.println(majorityElement(num));
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0], count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }


        }
        return candidate;
    }
}

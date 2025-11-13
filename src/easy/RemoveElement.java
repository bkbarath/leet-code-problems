package easy;

public class RemoveElement {

    public static void main(String[] args) {
        int[] num = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(num, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {

            int value = nums[i];
            if (value == val) {
                n--;
                nums[i] = nums[n];
                nums[n] = value;
            } else {
                i++;
            }
        }

        return n;
    }
}

package easy;

public class OnesAreKPlacesAway {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        System.out.println(kLengthApart(nums, 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int distance = 0;
        boolean firstOne = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0 && firstOne) {
                distance++;
            }

            if (nums[i] == 1 && !firstOne) {
                firstOne = true;
                continue;
            }

            if (nums[i] == 1 && firstOne) {
                if (distance >= k) {
                    distance = 0;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

package easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> integers = new HashSet<>();

        for (int num : nums) {
            if (integers.contains(num)) {
                return true;
            } else {
                integers.add(num);
            }
        }
        return false;
    }
}

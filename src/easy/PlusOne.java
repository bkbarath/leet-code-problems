package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digit = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digit)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      // just increment and return
                return digits;
            }
            digits[i] = 0;        // carry forward
        }

        // If all digits were 9 → result is like 999 + 1 = 1000
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

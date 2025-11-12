package easy;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0, right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

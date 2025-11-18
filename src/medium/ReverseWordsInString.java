package medium;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] split = s.trim().split(" ");
        int n = split.length;
        StringBuilder reversed = new StringBuilder();
        int left = 0, right = n - 1;

        while (left < right) {
            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;

            left++;
            right--;
        }

        for (String string : split) {
            if(!string.isEmpty())
                reversed.append(string).append(" ");
        }

        return reversed.toString().trim();
    }
}

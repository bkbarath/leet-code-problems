package medium;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "bcabad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        int n = s.length();

        if (n == 1) return s;

        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {


            for (int j = 0; j <= 1; j++) {

                int low = i;
                int high = i + j;

                while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {

                    int currentLen = high - low + 1;

                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                        start = low;
                    }

                    low--;
                    high++;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}

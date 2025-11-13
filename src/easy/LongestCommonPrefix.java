package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {

        int i = 0;
        boolean isPrefix = true;
        String longestPref = "";
        while (isPrefix) {
            if (strs[0].length() <= i) {
                isPrefix = false;
                break;
            }
            char ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() == i || ch != strs[j].charAt(i)) {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix) {
                longestPref = longestPref + ch;
                i++;
            }
        }

        return longestPref;
    }
}

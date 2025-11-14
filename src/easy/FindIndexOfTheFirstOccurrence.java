package easy;

public class FindIndexOfTheFirstOccurrence {

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "sad"));
    }

    public static int strStr(String haystack, String needle) {

        int hLen = haystack.length(), nLen = needle.length();

        if (hLen < nLen) return -1;
        if (haystack.isEmpty()) return 0;
        if(haystack.equals(needle)) return 0;

        for (int i = 0; i < hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}

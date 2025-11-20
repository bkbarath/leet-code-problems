package easy;

public class IsSubSequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        int n = string1.length;
        int m = string2.length;
        int index = 0;

        for (int i = 0; i < string1.length; i++) {
            int remaining = n - (i + 1);
            boolean isMatch = false;
            for (int j = index; j < m - remaining; j++) {
                if (string1[i] == string2[j]) {
                    index = j + 1;
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) return false;
        }

        return true;
    }
}

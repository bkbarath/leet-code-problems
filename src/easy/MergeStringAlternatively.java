package easy;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder append = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int n = Math.max(word1Length, word2Length);

        for (int i = 0; i < n; i++) {
                if (word1Length > i) {
                    append.append(word1.charAt(i));
                }
                if (word2Length > i) {
                    append.append(word2.charAt(i));
                }
        }

        return append.toString();
    }
}

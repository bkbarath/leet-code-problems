package easy;

public class ReverseWordInString3 {
    public static void main(String[] args) {
        ReverseWordInString3 solution = new ReverseWordInString3();
        String s = "Let's take LeetCode contest";
        System.out.println(solution.reverseWords(s)); // Output: "s'teL ekat edoCteeL tsetnoc"

    }

    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}

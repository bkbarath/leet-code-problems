package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.trim().split(" ");
        return split[split.length - 1].length();
    }
}

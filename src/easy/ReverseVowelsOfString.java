package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.println(reverseVowelsSol2("IceCreAm"));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiou";
        String[] split = s.split("");
        ArrayList<String> available = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            String value = split[i];
            if (vowels.contains(value.toLowerCase())) {
                available.add(value);
            }
        }

        int n = available.size();

        for (int i = 0; i < split.length; i++) {
            String value = split[i];
            if (vowels.contains(value.toLowerCase())) {
                split[i] = available.get(--n);
            }
        }
        StringBuilder update = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            update.append(split[i]);
        }

        System.out.println(Arrays.toString(split));

        return update.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String reverseVowelsSol2(String s) {
        char[] split = s.toCharArray();
        int left = 0;
        int right = split.length - 1;
        while (left < right) {

            while (left < right && !isVowel(split[left])) {
                left++;
            }

            while (left < right && !isVowel(split[right])) {
                right--;
            }

            char temp = split[left];
            split[left] = split[right];
            split[right] = temp;

            left++;
            right--;
        }

        return new String(split);
    }
}

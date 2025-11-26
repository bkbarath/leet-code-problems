package medium;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {

        s = s.trim();
        int i = 0, n = s.length();
        boolean isNegative = false;

        if (n == 0) return 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-') isNegative = true;
            i++;
        }
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return isNegative ? -result : result;
    }
}

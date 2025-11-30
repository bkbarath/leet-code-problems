package medium;

public class MultiplyString {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456")); // Expected output: "56088"
    }

    public static String multiply(String num1, String num2) {

        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + pos[i + j + 1];

                pos[i + j + 1] = sum % 10;
                pos[i + j] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int p : pos) {
            if (!(result.isEmpty() && p == 0)) {
                result.append(p);
            }
        }

        return result.isEmpty() ? "0" : result.toString();
    }
}

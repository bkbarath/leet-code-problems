package medium;

public class ZIgZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(s, numRows));
    }

    // Time complexity: O(n) where n is the length of the string s
    // Space complexity: O(n) for the output string
    public static String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1) return s;
        StringBuilder stringBuilder = new StringBuilder(); // to store the result
        int increment = 2 * (numRows - 1); // the step size for each row
        // iterate through each row
        for (int i = 0; i < numRows; i++) {
            // iterate through each character in the row
            for (int j = i; j < s.length(); j += increment) {
                stringBuilder.append(s.charAt(j));
                // check for the diagonal element
                if (i > 0 && i < numRows - 1 && j + increment - 2 * i < s.length()) {
                    stringBuilder.append(s.charAt(j + increment - 2 * i));
                }
            }
        }

        // return the result
        return stringBuilder.toString();
    }
}

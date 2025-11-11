package easy;

import java.util.Objects;

// roman to numbers problem
public class RomanToNumbers {

    // main function
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMIV"));
    }

    // helper function to get proper number based on the characters
    public static int getNumbersForRoman(char c) {
        if (Objects.equals(c, 'I')) return 1;
        if (Objects.equals(c, 'V')) return 5;
        if (Objects.equals(c, 'X')) return 10;
        if (Objects.equals(c, 'L')) return 50;
        if (Objects.equals(c, 'C')) return 100;
        if (Objects.equals(c, 'D')) return 500;
        if (Objects.equals(c, 'M')) return 1000;
        return -1;
    }

    // function to convert roman number into decimal numbers
    public static int romanToInt(String s) {

        int res = 0; // store cumulative values

        // loop until end of the character
        for (int i = 0; i < s.length(); i++) {

            // get first string
            int string1 = getNumbersForRoman(s.charAt(i)); // for ex in our example: in i=0; it will take the value of `M` --> 1000

            // check whether the string contains next character: `C` will be available in the i = 0;
            if (i + 1 < s.length()) {

                // if yes get next character `C` -> 100
                int string2 = getNumbersForRoman(s.charAt(i + 1));

                // check if the string1 is greater than or equals to string2 then add to the total
                if (string1 >= string2) {
                    res += string1;
                } else { // else add the total subtract with the string2 value
                    res += string2 - string1;
                    i++;
                }
            } else {// else add the value and end the loop
                res += string1;
            }
        }

        // finally return the loop after conversion
        return res;
    }
}
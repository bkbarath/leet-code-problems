package medium;

public class NumbersToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }


    public static String intToRoman(int num) {

        // storing roman values of digits from 0-9
        // when placed at different places
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD",
                "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL",
                "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV",
                "V", "VI", "VII", "VIII", "IX"};

        // get thousands values
        String thousands = m[num / 1000];

        // get hundred values
        String hundreds = c[(num % 1000) / 100];

        // get tens values
        String tens = x[(num % 100) / 10];

        // get single digit values
        String ones = i[num % 10];

        // return cumulative string
        return thousands + hundreds + tens + ones;
    }
}

package easy;

public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {

        String str1 = "ABCABCABC", str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {

        int string1Length = str1.length();
        int string2Length = str2.length();

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(string1Length, string2Length));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
//    public static String gcdOfStrings(String str1, String str2) {
//
//        int n = Math.max(str1.length(), str2.length());
//        int i = 0;
//        char[] string1 = str1.toCharArray();
//        char[] string2 = str2.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder currentCheck =
//        boolean isSatisfied = true;
//
//        while (i < n) {
//            if (str2.length() > i) {
//
//                char value = str2.charAt(i);
//
//                for (int j = 0; j < string1.length; j++) {
//                    if (value != string1[j]) {
//                        isSatisfied = false;
//                        break;
//                    }
//                }
//
//                for (int j = 0; j < string2.length; j++) {
//                    if (value != string2[j]) {
//                        isSatisfied = false;
//                        break;
//                    }
//                }
//
//                if (isSatisfied)
//                    stringBuilder.append(value);
//                i++;
//            } else {
//                break;
//            }
//        }
//
//        return stringBuilder.toString();
//    }
}

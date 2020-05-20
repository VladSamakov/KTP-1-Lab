public class Palindrome {
    static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}

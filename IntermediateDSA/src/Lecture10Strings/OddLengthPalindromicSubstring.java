package Lecture10Strings;

public class OddLengthPalindromicSubstring {
    public static int longestOddLengthPalindromicSubstring(String str) {
        int n = str.length();
        int max = 1;
        for (int i = 0 ; i < n ; i++) {
            int left = i ;
            int right = i ;

            while(left >= 0 && right < n) {
                if (str.charAt(left) != str.charAt(right)) {
                    break;
                }
                left-- ;
                right++;
            }
            int len = (right - left - 1);
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "anamadamm";
        String s = "liril";
        String s2 = "aaabaaa";
        System.out.println(longestOddLengthPalindromicSubstring(str));
        System.out.println(longestOddLengthPalindromicSubstring(s));
        System.out.println(longestOddLengthPalindromicSubstring(s2));
    }
}

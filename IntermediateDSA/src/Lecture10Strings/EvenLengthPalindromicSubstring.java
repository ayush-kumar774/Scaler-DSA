package Lecture10Strings;

public class EvenLengthPalindromicSubstring {
    public static int longestEvenLengthPalindromicSubstring(String str) {
        int n = str.length();
        int max = 0;
        for (int i = 1 ; i < n ; i++) {
            int left = i ;
            int right = i ;
            if (str.charAt(left) == str.charAt(right)) {
                while(left > 0 && right < n) {
                    if (str.charAt(left - 1) != str.charAt(right)) {
                        break;
                    }
                    left-- ;
                    right++;
                }
                int length = (right - left) ;
                if (length % 2 == 0) {
                    max = Math.max(max, ((right - left)));
                }
            }
        }
        return max;
    }

    public static int longestEvenLengthPalindromicSubstringOptimizedCode(String str) {
        int n = str.length();
        int max = 0 ;
        for (int i = 0 ; i < n - 1 ; i++) {
            int left = i ;
            int right = i + 1 ;
            if (str.charAt(left) == str.charAt(right)) {
                while (left >= 0 && right < n) {
                    if (str.charAt(left) != str.charAt(right)) {
                        break;
                    }
                    left--;
                    right++;
                }
                int len = (right - left - 1);
                if (len % 2 == 0) {
                    max = Math.max(len, max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "cabbad";
        String s = "abccba";
        String s2 = "amma";
        String s3 = "hannah";
        String s4 = "aa";
        String s5 = "anamadamm";
        String s6 = "abhannahck";
        String s7 = "ab";
        String s8 = "a";
        String s9 = "abc";
        System.out.println(longestEvenLengthPalindromicSubstring(str) == longestEvenLengthPalindromicSubstringOptimizedCode(str));
        System.out.println(longestEvenLengthPalindromicSubstring(s) == longestEvenLengthPalindromicSubstringOptimizedCode(s));
        System.out.println(longestEvenLengthPalindromicSubstring(s2) == longestEvenLengthPalindromicSubstringOptimizedCode(s2));
        System.out.println(longestEvenLengthPalindromicSubstring(s3) == longestEvenLengthPalindromicSubstringOptimizedCode(s3));
        System.out.println(longestEvenLengthPalindromicSubstring(s4) == longestEvenLengthPalindromicSubstringOptimizedCode(s4));
        System.out.println(longestEvenLengthPalindromicSubstring(s5) == longestEvenLengthPalindromicSubstringOptimizedCode(s5));
        System.out.println(longestEvenLengthPalindromicSubstring(s6) == longestEvenLengthPalindromicSubstringOptimizedCode(s6));
        System.out.println(longestEvenLengthPalindromicSubstring(s7) == longestEvenLengthPalindromicSubstringOptimizedCode(s7));
        System.out.println(longestEvenLengthPalindromicSubstring(s8) == longestEvenLengthPalindromicSubstringOptimizedCode(s8));
        System.out.println(longestEvenLengthPalindromicSubstring(s9) == longestEvenLengthPalindromicSubstringOptimizedCode(s9));
    }
}

package Contest2;

import java.util.HashMap;
import java.util.Map;

public class KingAndPalindromes {
    private static int solve(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int maxLength = 0;
        boolean oddCountFound = false;

        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                maxLength += count;
            } else {
                maxLength += count - 1;
                oddCountFound = true;
            }
        }
        if (oddCountFound) {
            maxLength += 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String A = "banana";
        String B = "abcabc";
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}


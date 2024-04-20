package Lecture10Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello, There!";
        for (int i = 0 ; i < str.length() ; i++) {
            System.out.print((int)(str.charAt(i)) + " ");
        }
        System.out.println();
        char[] s = str.toCharArray();
        for (int i = 0 ; i < str.length() ; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
//                s[i] = Character.toLowerCase(s[i]);
                s[i] = (char) (s[i] + ('a' - 'A'));
            }

            else if (s[i] >= 'a' && s[i] <= 'z') {
//                s[i] = Character.toUpperCase(s[i]);
                s[i] = (char) (s[i] - ('a' - 'A'));
            }
        }
        for (char ch : s) {
            System.out.print(ch);
        }

    }
}

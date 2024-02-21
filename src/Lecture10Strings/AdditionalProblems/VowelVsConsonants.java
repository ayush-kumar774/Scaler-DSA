package Lecture10Strings.AdditionalProblems;

import java.util.Scanner;

public class VowelVsConsonants {
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static int vowelCount(String str) {
        int counter = 0 ;
        for (int i = 0 ; i < str.length() ; i++) {
            if (isVowel(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int consonantsCount(String str) {
        int counter = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            if (!(isVowel(str.charAt(i)))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            String str = sc.next();
            int vowelCount = vowelCount(str);
            int consonantsCount = consonantsCount(str);
            System.out.println(vowelCount  + " " + consonantsCount);
            testcases--;
        }
    }
}

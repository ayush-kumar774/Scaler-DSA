package Lecture10Strings.Assignment;

import java.util.Scanner;

public class DiverseCharacters {
    public static int solve(final String A) {
        int alphabets = 0;
        int digits = 0;
        for (int i = 0 ; i < A.length(); i++) {
            if (Character.isDigit(A.charAt(i))) {
                digits++;
            }
            else {
                alphabets++;
            }
        }
        return (Math.max(alphabets, digits));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        System.out.println(solve("M1234"));
    }
}

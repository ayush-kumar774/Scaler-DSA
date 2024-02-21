package Lecture10Strings.Assignment;

import java.util.Scanner;

public class FirstOccurrence {
    public static int solve(final String A, final int B) {
        for (int i = (A.length() - 1) ; i >= 0 ; i--) {
            if (A.charAt(i) == B) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int B = sc.nextInt();
        System.out.println(solve(str, B));
    }
}

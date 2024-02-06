package Lecture3WhileLoop.AdditionalProblems;

import java.util.Scanner;

public class PalindromicInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num ;
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        if (n == reverse) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

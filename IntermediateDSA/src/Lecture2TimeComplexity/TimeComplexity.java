package Lecture2TimeComplexity;

import java.util.Scanner;

public class TimeComplexity {
    private static int findLogarithm(int logBase, int n) {
        return (int)(Math.log(n) / Math.log(logBase));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int logBase = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findLogarithm(logBase, n));
    }
}


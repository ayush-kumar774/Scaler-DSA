package Lecture7Arrays.AdditionalProblems;

import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int testcases = sc.nextInt();
        for (int t = 0 ; t < testcases ; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0 ; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0 ; i < n ; i++) {
                if (arr[i] % 2 == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            for (int i = 0 ; i < n ; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            long ans = 1L;
        }
    }
}

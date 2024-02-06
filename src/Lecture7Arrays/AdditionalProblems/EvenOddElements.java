package Lecture7Arrays.AdditionalProblems;

import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int testcases = sc.nextInt();
        for (int t = 0 ; t < testcases ; t++)
        {
            int num = sc.nextInt();
            int[] arr = new int[num];
            int even = 0;
            int odd = 0;
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println(Math.abs(odd - even));
        }
    }
}

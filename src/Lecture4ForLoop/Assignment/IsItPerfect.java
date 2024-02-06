package Lecture4ForLoop.Assignment;

import java.util.Scanner;

public class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0 ; i < testcases; i++) {
            int num = sc.nextInt() ;
            int sum = 0 ;
            for (int j = 1 ; j <= (num/2) ; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (sum == num) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

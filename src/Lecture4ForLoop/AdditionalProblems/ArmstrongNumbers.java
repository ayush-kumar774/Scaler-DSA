package Lecture4ForLoop.AdditionalProblems;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            int sum = 0 ;
            int temp = i ;
            while (temp > 0) {
                int d = temp % 10;
                sum += (d * d * d) ;
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

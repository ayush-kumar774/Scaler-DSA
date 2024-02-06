package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int sum = 0 ;
            int num = sc.nextInt() ;
            while (num > 0) {
                sum += (num % 10) ;
                num /= 10;
            }
            System.out.println(sum);
            testcases--;
        }
    }
}

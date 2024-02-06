package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int num = sc.nextInt() ;
            int digit = 0 ;
            if (num == 0) digit = 1;
            while (num > 0) {
                digit++ ;
                num /= 10 ;
            }
            System.out.println(digit);
            testcases--;
        }
    }
}

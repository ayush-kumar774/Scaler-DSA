package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class FirstVsLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int n = sc.nextInt();
            int first = n % 10 ;
            int last = n % 10 ;
            while (n > 0) {
                first = (n % 10) ;
                n /= 10 ;
            }
            System.out.println(first + " " + last);
            testcases--;
        }
    }
}

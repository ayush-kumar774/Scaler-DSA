package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class PrintPerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int i = 1 ;
        while ((i * i) <= n) {
            System.out.print((i * i) + " ");
            i++ ;
        }
    }
}

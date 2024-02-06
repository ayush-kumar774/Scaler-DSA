package Lecture3WhileLoop.AdditionalProblems;

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0 ;
        int i = 2 ;
        while (i <= num) {
            sum += i ;
            i += 2 ;
        }
        System.out.println(sum);
    }
}

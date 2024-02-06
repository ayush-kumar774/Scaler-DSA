package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class EvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
        int i = 2 ;
        while (i <= num) {
            System.out.print(i + " ");
            i += 2 ;
        }
    }
}

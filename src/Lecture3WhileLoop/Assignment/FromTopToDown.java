package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class FromTopToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0 ;
        while (i < n) {
            System.out.print((i + 1) + " ");
            i++;
        }
    }
}

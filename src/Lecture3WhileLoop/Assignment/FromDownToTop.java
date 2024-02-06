package Lecture3WhileLoop.Assignment;

import java.util.Scanner;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            System.out.print(n + " ");
            n-- ;
        }
    }
}

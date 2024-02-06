package Lecture5Pattern.Assignment;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row = 1 ; row <= num ; row++) {
            // Print spaces
            for (int space = 1; space <= (num - row) ; space++) {
                System.out.print(" ");
            }
            // Print
            for (int star = 1 ; star <= (row) ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

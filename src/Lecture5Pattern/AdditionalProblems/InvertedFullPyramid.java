package Lecture5Pattern.AdditionalProblems;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        for (int row = 1 ; row <= n ; row++) {
            for(int space = 0 ; space < row - 1; space++ ) {
                System.out.print(" ");
            }
            for (int star = (n - row + 1) ; star >= 1 ; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

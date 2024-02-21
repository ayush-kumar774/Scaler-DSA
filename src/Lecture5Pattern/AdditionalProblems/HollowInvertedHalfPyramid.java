package Lecture5Pattern.AdditionalProblems;

import java.util.Scanner;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int star = 1 ; star <= n; star++) {
            System.out.print("*");
        }
        System.out.println();
        for (int row = (n - 1) ; row > 0; row--) {
            for (int star = 1 ; star <= row ; star++) {
                if (star == 1) {
                    System.out.print("*");
                }
                else if (star == row) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

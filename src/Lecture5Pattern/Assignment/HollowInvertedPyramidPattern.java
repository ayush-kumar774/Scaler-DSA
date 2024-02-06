package Lecture5Pattern.Assignment;

import java.util.Scanner;

public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int row = 1 ; row <= num ; row++) {
            for (int star1 = 1 ; star1 <= row ; star1++) {
                System.out.print("*");
            }
            for (int space = 1 ; space <= ( 2 * (num - row) ); space++) {
                System.out.print(" ");
            }
            for (int star2 = 1 ; star2 <= row ; star2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

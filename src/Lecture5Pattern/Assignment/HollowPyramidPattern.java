package Lecture5Pattern.Assignment;

import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int row = 1 ; row <= num; row++) {
            for (int star1 = 1 ; star1 <= ((num + 1) - row ) ; star1++) {
                System.out.print("*");
            }
            for (int space = 1 ; space <= 2 * (row - 1) ; space++ ) {
                System.out.print(" ");
            }
            for (int star1 = 1 ; star1 <= ((num + 1) - row ) ; star1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

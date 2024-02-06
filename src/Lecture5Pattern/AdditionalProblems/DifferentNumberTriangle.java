package Lecture5Pattern.AdditionalProblems;

import java.util.Scanner;

public class DifferentNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num ;
        for (int row = 1 ; row <= num ; row++) {
            for (int zeros = 1 ; zeros <= (num - row) ; zeros++) {
                System.out.print("0 ");
            }
            for (int n = 1 ; n <= (2 * row - 1) ; n++) {
                System.out.print((temp * n) + " ");
            }
            for (int zeros = 1 ; zeros <= (num - row) ; zeros++) {
                System.out.print("0 ");
            }
            temp--;
            System.out.println();
        }
    }
}

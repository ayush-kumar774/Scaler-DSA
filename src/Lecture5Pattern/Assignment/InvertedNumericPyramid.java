package Lecture5Pattern.Assignment;

import java.util.Scanner;

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int row = 1 ; row <= num ; row++) {
            for (int star = 1 ; star <= (num - row + 1) ; star++) {
                if (star != (num - row + 1) ) System.out.print(star + " ");
                else System.out.print(star);
            }
            System.out.println();
        }
    }
}

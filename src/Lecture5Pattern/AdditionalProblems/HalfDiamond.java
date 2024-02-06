package Lecture5Pattern.AdditionalProblems;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int row = 1 ; row <= (num) ; row++) {
            for (int i = 1 ; i <= row ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = (num - 1) ; row >= 1 ; row--) {
            for (int i = 1 ; i <= row ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

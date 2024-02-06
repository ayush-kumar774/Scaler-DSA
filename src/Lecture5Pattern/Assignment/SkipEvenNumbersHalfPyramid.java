package Lecture5Pattern.Assignment;

import java.util.Scanner;

public class SkipEvenNumbersHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++) {
            for (int j = 1 ; j <= (i - 1) ; j++) {
                if (j % 2 != 0) System.out.print(j + " ");
            }
            if(i % 2 != 0) System.out.print(i);
            System.out.println();
        }
    }
}

package Lecture2IfElse.AdditionalProblems;

import java.util.Scanner;

public class AnglesOfValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b + c) == 180 ) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}

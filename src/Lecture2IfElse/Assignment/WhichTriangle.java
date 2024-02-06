package Lecture2IfElse.Assignment;

import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c) {
            System.out.println("equilateral");
        }
        else if (a != b && b != c && a != c) {
            System.out.println("scalene");
        }
        else {
            System.out.println("isosceles");
        }
    }
}
/*
Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the triangle is "equilateral", "scalene" or "isosceles".
 */
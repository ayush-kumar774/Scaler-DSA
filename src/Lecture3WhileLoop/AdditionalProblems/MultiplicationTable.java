package Lecture3WhileLoop.AdditionalProblems;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1 ;
        while (i < 11) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}

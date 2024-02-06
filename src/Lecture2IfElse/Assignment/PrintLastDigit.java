package Lecture2IfElse.Assignment;

import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 10);
    }
}

package Lecture4ForLoop.Assignment;

import java.util.Scanner;

public class PrintNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i < n ;i++) {
            System.out.print("*");
        }
    }
}

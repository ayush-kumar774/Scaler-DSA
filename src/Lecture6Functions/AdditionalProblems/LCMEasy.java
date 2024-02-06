package Lecture6Functions.AdditionalProblems;

import java.util.Scanner;

public class LCMEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1 ;
        for (int i = 2 ; i <= a && i <= b ; i++ ) {
            if (a % i == 0 && b % i == 0) {
                hcf = Math.max(hcf, i);
            }
        }
        System.out.println((a * b) / hcf);
    }
}

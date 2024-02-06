package Lecture4ForLoop.Assignment;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1 ;
        for (int i = 1 ; i <= (n/2) ; i++) {
            if (n % i == 0) counter++;
        }
        System.out.println(counter);
    }
}

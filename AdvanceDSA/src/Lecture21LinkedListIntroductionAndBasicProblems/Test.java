package Lecture21LinkedListIntroductionAndBasicProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int a = 0, b = 0 , c = 4 ;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Arrays.toString(simple(a, b, c)));
    }
    public static int[] simple(int a, int b, int c) {
        if (a + b + c != 0) {
            return new int[] {a, b, c};
        }
        else {
            return new int[] {};
        }
    }
}

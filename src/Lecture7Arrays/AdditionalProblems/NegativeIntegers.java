package Lecture7Arrays.AdditionalProblems;

import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

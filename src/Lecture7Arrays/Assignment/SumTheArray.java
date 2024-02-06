package Lecture7Arrays.Assignment;

import java.util.Scanner;

public class SumTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int[num];
        int sum = 0 ;
        for (int i = 0 ; i < num ; i++ ) {
            arr[i] = sc.nextInt() ;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

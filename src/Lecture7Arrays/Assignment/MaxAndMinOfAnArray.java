package Lecture7Arrays.Assignment;

import java.util.Scanner;

public class MaxAndMinOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int[num] ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE ;
        for (int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt() ;
            max = Math.max(arr[i] , max);
            min = Math.min(arr[i], min) ;
        }
        System.out.println(max + " " + min);
    }
}

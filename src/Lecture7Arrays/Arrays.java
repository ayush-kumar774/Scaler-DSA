package Lecture7Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Take an integer array arr of size N as input and print its sum.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int[num];
        int sum = 0 ;
        for (int i  = 0; i < num ; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of the elements " + sum);

        // Take an integer array arr of size N as input and print its maximum element.
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < num ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max of array " + max);

        // Take an integer array arr of size N as input and print its minimum element.
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < num ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min of the array " + min);

        // Given an array check whether k is present or not
        int k = sc.nextInt() ;
        boolean flag = false ;
        for (int i = 0 ; i < num ; i++) {
            if (k == arr[i]) {
                flag = true;
                break ;
            }
        }
        if (flag) System.out.println("True, " + k +" is present.");
        else System.out.println("False, "+ k +" is not present.");

        // Given an array return the frequency of k
        int count = 0 ;
        for (int i = 0 ; i < num ; i++) {
            if (arr[i] == k) {
                count++ ;
            }
        }
        System.out.println("Frequency is " + count);

        // Given an array, return the frequency of count of an array.
        int ans[] = new int[num];
        for (int i = 0 ; i < num ; i++) {
            int counter = 0 ;
            for (int j = 0 ; j < num ; j++) {
                if (arr[i] == arr[j]) {
                    counter ++ ;
                }
            }
            ans[i] = counter ;
        }
        for (int x : ans) {
            System.out.print( x + " ");
            // do it using function.
        }
        System.out.println();

        // Given an array, check whether it is strictly increasing or not
        boolean st = true ;
        for (int i = 0 ; i < num - 1 ;i++) {
            if  (arr[i] >= arr[i + 1]) {
                st = false ;
                break ;
            }
        }
        if (st) System.out.println("Strictly increasing.");
        else System.out.println("Not strictly increasing.");
    }
}

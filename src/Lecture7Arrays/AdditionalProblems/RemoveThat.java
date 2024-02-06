package Lecture7Arrays.AdditionalProblems;

import java.util.Scanner;

public class RemoveThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        for (int i = (pos - 1) ; i < (num - 1) ; i++) {
            arr[i] = arr[i + 1] ;
        }
        for (int i = 0 ; i < (num - 1) ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

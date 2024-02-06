package Lecture7Arrays.Assignment;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1];
        for (int i = 0 ; i < num ; i++) {
                arr[i] = sc.nextInt() ;
        }
        int pos = sc.nextInt();
        int y = sc.nextInt();
        for (int i = num ; i >= pos;  i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1]= y ;
        for (int x : arr) {
            System.out.print(x  + " ");
        }
    }
}

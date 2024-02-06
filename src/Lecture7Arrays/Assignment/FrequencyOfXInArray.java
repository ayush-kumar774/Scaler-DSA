package Lecture7Arrays.Assignment;

import java.util.Scanner;

public class FrequencyOfXInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0 ; i < num; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                break;
            }
        }
    }
}

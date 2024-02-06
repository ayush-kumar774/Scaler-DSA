package Lecture7Arrays.Assignment;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int testcases = sc.nextInt();
        for (int t = 1 ; t <= testcases ; t++)
        {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            boolean flag = false;
            for (int i = 0; i < num; i++) {
                if (arr[i] == x) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}

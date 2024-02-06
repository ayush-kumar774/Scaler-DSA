package Lecture4ForLoop.Assignment;

import java.util.Scanner;

public class IsIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false ;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("NO");
        }else  {
            System.out.println("YES");
        }
    }
}

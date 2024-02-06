package Lecture3WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Given an integer N as input. Print from 1 to N?

//        int n = sc.nextInt();
//        int i = 1 ;
//        while (i <= n) {
//            System.out.print(i + " ");
//            i += 1;
//        }

//        Given an integer N as input. Print from N to 1?
//        int n = sc.nextInt();
//        while (n > 0) {
//            System.out.print(n + " ");
//            n-- ;
//        }

//        Given an integer N as input. Print odd values from 1 to N?
//        int num = sc.nextInt();
//        int i = 1 ;
//        while (i <= num) {
//            System.out.print(i + " ");
//            i += 2 ;
//        }

//        Given an integer N as input. Print odd values from 1 to N?
//        int num = sc.nextInt();
//        int i = 2 ;
//        while (i <= num) {
//            System.out.print(i + " ");
//            i += 2 ;
//        }


//        Given an integer N as input, print multiples Of 4 till N?
//        int num = sc.nextInt();
//        int i = 4 ;
//        while (i <= num) {
//            System.out.print(i + " ");
//            i += 4 ;
//        }

//        int num = sc.nextInt();
//        int i = 3;
//        while(i <= num){
//            System.out.print(i + " ");
//            i += 3;
//        }

//         Quiz (infinite loop)
//        int i = 0 ;
//        while (i <= 10) {
//            System.out.println(i + " ");
//            i = i * i ;
//        }

//         Quiz
//        int i = 1 ;
//        while (i <= 10) {
//            i = i * i ;
//            System.out.println( i + " ");
//            i += 1;
//        }

//        Given an integer N as input, print perfect squares till N?
//        int num = sc.nextInt();
//        int i = 1;
//        while ((i * i )<= num) {
//            System.out.print((i*i) + " ");
//            i = i + 1 ;
//        }

//        Given an integer N as input, print its digits in reverse order.
//        int num = sc.nextInt();
//        if (num < 0) {
//            num *= -1;
//        }
//        num = Math.abs(num);
//        while (num > 0) {
//            System.out.print(num % 10 + " "); // prints last digit
//            num = (num / 10); // removes last digit
//        }


//        Given an integer n as input print sum of its digit.
//        int num = sc.nextInt();fdf
//        int sum = 0;
//        while (num > 0) {
//            sum += (num % 10);
//            num /= 10;
//        }
//        System.out.println(sum);

//        Given integer n as input, reverse it.
        int num = sc.nextInt();
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10) ;
            num /= 10 ;
        }
        System.out.println(reverse);
    }
}

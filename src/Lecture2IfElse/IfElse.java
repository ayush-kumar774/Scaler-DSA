package Lecture2IfElse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Question 1
//        int afganistan = sc.nextInt();
//        if (afganistan > 200) {
//            System.out.println("AFG won!!");
//        } else if (afganistan == 200) {
//            System.out.println("DRAW!!");
//        }
//        else {
//            System.out.println("IND won!!");
//        }

        // Question 2
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("can vote");
//        }
//        else {
//            System.out.println("can not vote");
//        }

        // Question 3
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a == b) {
//            System.out.println("Both the number are equal");
//        } else if (a > b) {
//            System.out.println(a + " is greater.");
//        }
//        else {
//            System.out.println(b + " is greater.");
//        System.out.println(Math.max(a, b));

        // Given temperature of patient in Fahrenheit as input,
        //print whether the temperature is low, normal, high normal from 98.2 till 98.8
//        float temp = sc.nextFloat();
//        if (temp < 98.2) {
//            System.out.println("low");
//        }
//        else if (temp >= 98.2 && temp <= 98.8) {
//            System.out.println("normal");
//        }
//        else {
//            System.out.println("high");
//        }

        // In arithmetic operations, the result is always the higher data type.
        // int/int -> int
        // int/float -> float
        // long/int -> long

//        int x = 100000;
//        int y = 100000;
//        long ans = ((long) x * y);
//        System.out.println(ans);

        // % modulo operator
        // 12 % 5 = 2
        // 5 % 12 = 5 (Since the dividend(5) is less than divisor(12))

        // Q. Given an integer as input,
        // print whether it is even or Odd
//        int num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }

//        Given an integer as input, print its last digit
//        int num2 = sc.nextInt();
//        System.out.println(num2 % 10);

//        Q6 : Given units of electricity consumed as an integer input A, print the bill amount.
//        Provided below is the range of electricity consumed and rate at which it is charged:-
//        [1-50] ---> ₹1
//        [51-100] ---> ₹2
//        [101 and beyond] ---> ₹4

//        int unit = sc.nextInt();
//        if (unit >= 1 && unit <= 50) System.out.println(unit);
//        else if (unit >= 51 && unit <= 100) {
//            int remUnit = unit - 50 ;
//            System.out.println( ( (remUnit * 2) + 50 ));
//        }
//        else {
//            int remUnit = unit - 100 ;
//            System.out.println( (remUnit * 4) + (150));
//        }

        // Given an integer A as input If it is a multiple of 3, print Fizz
        // If it is a multiple of 5, print Buzz
        // If it is a multiple of 3 and 5, print Fizz-Buzz
//        int num = sc.nextInt();
//        if (num % 15 == 0) {
//            System.out.println("Fizz-Buzz");
//        }
//        else if (num % 5 == 0) {
//            System.out.println("Buzz");
//        }
//        else if (num % 3 == 0){
//            System.out.println("Fizz");
//        }
//        else {
//            System.out.println("No-Fizz-Buzz");
//        }

        // int and string input
        int n = sc.nextInt();
//        sc.nextLine();
        String str = sc.nextLine(); // Input -> 10 ABC
        System.out.println(n + " " + str); // 10  ABC (Because we are separating the int and string with the space)
    }


}


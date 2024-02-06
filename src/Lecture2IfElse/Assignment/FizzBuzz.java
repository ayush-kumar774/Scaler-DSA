package Lecture2IfElse.Assignment;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 15 == 0) {
            System.out.println("Fizz-Buzz");
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (num % 3 == 0){
            System.out.println("Fizz");
        }
        else {
            System.out.println("No-Fizz-Buzz");
        }
    }
}

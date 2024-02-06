package Lecture2IfElse.AdditionalProblems;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, s;
        c = sc.nextInt();
        s = sc.nextInt();
        if (c > s) {
            System.out.println(-1);
            System.out.println(c - s);
        }
        else {
            System.out.println(1);
            System.out.println(s - c);
        }
    }
}
/*
Problem Description

You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

NOTE: It is guaranteed that Cost Price and Selling Price are not equal.

NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.



Problem Constraints

1 <= C, S <= 109

C ≠ S



Input Format

First line of the input contains a single integer C.

Second line of the input contains a single integer S.



Output Format

Print two integers in separate lines.

First integer denotes whether there is a profit or loss. If there is a profit, print 1, else print -1.

Second integer is a non-negative integer denoting the absolute value of total profit or loss.


 */
package Lecture2IfElse.AdditionalProblems;

import java.util.Scanner;

public class CodingRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2100) {
            if (n % 2 == 0) {
                System.out.println("GRAND MASTER");
            }
            else {
                System.out.println("grand master");
            }
        }
        else if (n >= 1900) {
            if (n % 2 == 0) {
                System.out.println("CANDIDATE MASTER");
            }
            else {
                System.out.println("candidate master");
            }
        }
        else if (n >= 1600) {
            if (n % 2 == 0) {
                System.out.println("EXPERT");
            }
            else {
                System.out.println("expert");
            }
        }
        else if (n >= 1400) {
            if (n % 2 == 0) {
                System.out.println("PUPIL");
            }
            else {
                System.out.println("pupil");
            }
        }
        else {
            if (n % 2 == 0) {
                System.out.println("NEWBIE");
            }
            else {
                System.out.println("newbie");
            }
        }
    }
}
/*
Problem Description
Write a program to input from user an integer(n) representing the rating of a person on a platform.

You have to print the category of that person.

If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master".
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE


Problem Constraints
1000 <= n <= 2500



Input Format
One line containing an integer n.

Output Format
A string representing the category of the person.

Example
Input 1:
1659

Input 2:
2100


Example
Output 1:
expert

Output 2:
GRAND MASTER


Example
Explanation 1:
Clearly, 1659 is odd and is in the range of expert.

Explanation 2:
Clearly, 2100 is even and is in the range of grand master.

 */
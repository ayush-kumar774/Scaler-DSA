package Lecture2IfElse.Assignment;

import java.util.Scanner;

public class WhichMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(months[a - 1]);
    }
}

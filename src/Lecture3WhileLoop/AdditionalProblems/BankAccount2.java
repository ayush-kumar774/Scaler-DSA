package Lecture3WhileLoop.AdditionalProblems;

import java.util.Scanner;

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long balance = sc.nextLong();
        long operation = sc.nextLong();
        while (operation > 0) {
            long action = sc.nextLong() ;
            long amount = sc.nextLong() ;
            if (action == 1) {
                balance += amount ;
                System.out.println(balance);
            } else {
                if (amount > balance) {
                    System.out.println("Insufficient Funds");
                }
                else {
                    balance -= amount;
                    System.out.println(balance);
                }
            }
            operation--;
        }
    }
}

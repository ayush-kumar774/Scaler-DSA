package Lecture2IfElse.Assignment;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 2 == 0) && (a > 0)) {
            System.out.println("Even-Positive");
        }
        else if ((a % 2 == 0) && (a < 0)) {
            System.out.println("Even-Negative");
        }
        else if (a % 2 == 1) {
            System.out.println("Odd-Positive");
        }
        else {
            System.out.println("Odd-Negative");
        }
    }
}

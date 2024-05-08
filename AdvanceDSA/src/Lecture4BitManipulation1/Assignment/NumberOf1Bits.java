package Lecture4BitManipulation1.Assignment;

public class NumberOf1Bits {
    public static int solve(int A) {
        int counter = 0 ;
        while (A > 0) {
            if ((A & 1) == 1) {
                counter++;
            }
            A = A >> 1;
        }
        return counter;
    }
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        System.out.println(solve(a));
        System.out.println(solve(b));
    }
}

package Lecture7Recursion2.Assignment;

public class ImplementPowerFunction {
    public static int pow(int A, int B, int C) {
        if (B == 0) {
            return 1 % C;
        }
        long x = pow(A, B / 2 , C) % C;
        x = (x * x) % C;

        if (B % 2 == 0) {
            return (int)x;
        } else {
            return (int)((x * (A % C)) % C + C) % C;
        }

    }

    public static void main(String[] args) {
        System.out.println(pow(-1, 1, 20));
    }
}

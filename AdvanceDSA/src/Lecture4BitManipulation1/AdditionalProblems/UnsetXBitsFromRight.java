package Lecture4BitManipulation1.AdditionalProblems;

public class UnsetXBitsFromRight {
    public static long solve(long A, int B) {
        for (int i = 0 ; i < B; i++){
            if ((A & (1L << i)) > 0) {
                A = (A ^ (1L << i));
            }
        }
        return A ;
    }

    public static void main(String[] args) {
        int a1 = 25;
        int a2 = 37;
        int a3 = 93;
        int b1 = 3;
        int b2 = 3;
        int b3 = 4;

        System.out.println(solve(a1, b1));
        System.out.println(solve(a2, b2));
        System.out.println(solve(a3, b3));
    }
}

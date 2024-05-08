package Lecture5BitManipulation2.Assignment;

public class FindTwoMissingNumbers {
    public static int xor(int A) {
        int ans = 1;
        for (int i = 2 ; i < A ; i++) {
            ans ^= i;
        }
        return ans;
    }

    public static int xor(int[] A) {
        int ans = A[0] ;
        for (int i = 1 ; i < A.length; i++) {
            ans ^= A[i];
        }
        return ans;
    }

//    public static int[] solve(int[] A) {
//
//    }

    public static void main(String[] args) {
//        System.out.println(xor(3));
        int all = (xor(5));
        int[] A = {1, 2, 4};
        System.out.println(xor(A) ^ all);
    }
}

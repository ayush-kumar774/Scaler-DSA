package Lecture7Arrays.AdditionalProblems;

public class ConsecutiveDuplicates {
    public static boolean solve(int arr[]) {
        boolean ans = false ;
        for (int i = 0;  i < (arr.length - 1) ; i++) {
            if (arr[i] == arr[i + 1]) {
                return true ;
            }
        }
        return  ans ;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[] {1, 2, 3}));
    }
}

package Lecture7Arrays.Assignment;

import java.util.ArrayList;

public class CheckIfArrayIsSorted {
    public int solve(ArrayList<Integer> A) {
        int ans = 1;
        for (int i = 0 ; i < A.size() - 1 ; i++) {
            if (A.get(i) > A.get(i + 1)) {
                ans = 0 ;
                break;
            }
        }
        // ans = 1;
        return ans;
    }

    public static void main(String[] args) {

    }
}

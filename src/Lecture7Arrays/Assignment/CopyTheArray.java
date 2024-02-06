package Lecture7Arrays.Assignment;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> solve =  new ArrayList<Integer>();
        for (int i = 0 ; i < A.size() ; i++) {
            int x = ( A.get(i) + B );
            solve.add(x);
        }
        return solve;
    }
    public static void main(String[] args) {

    }
}

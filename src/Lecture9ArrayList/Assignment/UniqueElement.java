package Lecture9ArrayList.Assignment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UniqueElement {
    public static int solve (ArrayList<Integer> A) {
        for (int i = 0 ; i < A.size(); i++) {
            boolean isUnique = true;
            for (int j = 0 ; j < A.size(); j++ ) {
                if (i != j && Objects.equals(A.get(i), A.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return A.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] values = {7, 1, 5, 13, 1, 14, 19, 16, 15, 8, 10, 15, 17, 35, 12, 17, 14, 19,
                11, 9, 5, 10, 12, 18, 16, 4, 4, 6, 3, 3, 2, 11, 8, 18, 6, 20, 13, 2, 7, 9, 20};
        for (int value : values) {
            arr.add(value);
        }
//        for (int i = 0 ; i < num ; i++) {
//            int x = sc.nextInt();
//            arr.add(x);
//        }
        System.out.println(solve(arr));
    }
}

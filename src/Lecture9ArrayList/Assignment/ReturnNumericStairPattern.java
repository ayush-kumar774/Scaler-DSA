package Lecture9ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnNumericStairPattern {
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0 ; i < A ; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0 ; j < (i + 1); j++) {
                ans.get(i).add(j + 1);
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solve(num));
    }
}

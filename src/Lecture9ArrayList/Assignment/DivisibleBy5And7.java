package Lecture9ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleBy5And7 {
    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int it ;
        for (Integer integer : arr) {
            it = integer;
            if (it % 35 == 0) {
                ans.add(it);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(num);
        for (int i = 0 ; i < num ; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println(solve(arr));
    }
}

package Lecture3Array3InterviewProblems.Assignment;

import java.util.ArrayList;

public class MergeSortedOverlappingIntervals2 {
    public static ArrayList<ArrayList<Integer>> mergeInterval(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int currS = A.get(0).get(0);
        int currE = A.get(0).get(1);

        for (int i = 1 ; i < A.size(); i++) {
            if (currE >= A.get(i).getFirst()) {
                currE = Math.max(currE, A.get(i).get(1));
            }
            else {
                ArrayList<Integer> mergedInterval = new ArrayList<>();
                mergedInterval.add(currS);
                mergedInterval.add(currE);
                ans.add(mergedInterval);

                currS = A.get(i).get(0);
                currE = A.get(i).get(1);
            }
        }
        ArrayList<Integer> lastInterval = new ArrayList<>();
        lastInterval.add(currS);
        lastInterval.add(currE);
        ans.add(lastInterval);
        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int[] ints : intervals) {
            ArrayList<Integer> interval = new ArrayList<>();
            interval.add(ints[0]);
            interval.add(ints[1]);
            A.add(interval);
        }

//        System.out.println(A);

        ArrayList<ArrayList<Integer>> ans = mergeInterval(A);
        System.out.println(ans);
    }
}
/*
Problem Description
You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.


Problem Constraints
1 <= len(A) <= 100000.
1 <= A[i][0] <= A[i][1] <= 100000

A is sorted based on the start value (A[i][0])



Input Format
First argument is a list of intervals in 2-Dimensional Array.



Output Format

Return the sorted list of intervals after merging all the overlapping intervals.



Example Input
Input 1:
[ [1, 3], [2, 6], [8, 10], [15, 18] ]

Input 2:
[ [2, 10], [4, 9], [6, 7] ]


Example Output
Output 1:
[ [1, 6], [8, 10], [15, 18] ]

Output 2:
[ [2, 10] ]


Example Explanation

Explanation 1:
Merge intervals [1,3] and [2,6] -> [1,6].
so, the required answer after merging is [1,6],[8,10],[15,18].
No more overlapping intervals present.

Explanation 2:
Merge intervals [2, 10], [4, 9], [6, 7] as [2,10].
Since [4, 9] and [6, 7] is overlapping inside the interval [2, 10].
so, the required answer after merging is [2, 10].
 */
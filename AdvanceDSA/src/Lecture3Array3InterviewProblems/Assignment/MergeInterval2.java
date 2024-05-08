package Lecture3Array3InterviewProblems.Assignment;

import java.util.ArrayList;

import java.util.List;

public class MergeInterval2 {
    public static int[][] insert(int[][] A, int[] B) {
        List<int[]> result = new ArrayList<>();
        int[] mergedInterval = new int[]{B[0], B[1]};
        for (int[] interval : A) {
            if (interval[1] < mergedInterval[0]) {
                result.add(interval);
            } else if (interval[0] > mergedInterval[1]) {
                result.add(mergedInterval);
                mergedInterval = new int[]{interval[0], interval[1]};
            } else {
                mergedInterval[0] = Math.min(mergedInterval[0], interval[0]);
                mergedInterval[1] = Math.max(mergedInterval[1], interval[1]);
            }
        }
        result.add(mergedInterval);
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] result1 = insert(intervals1, newInterval1);
        for (int[] interval : result1) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println(); // Output: [1, 5] [6, 9]

        int[][] intervals2 = {{1, 3}, {6, 9}};
        int[] newInterval2 = {2, 6};
        int[][] result2 = insert(intervals2, newInterval2);
        for (int[] interval : result2) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println(); // Output: [1, 9]
    }

}
/*
Problem Description
You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.



Problem Constraints
0 <= |intervals| <= 105



Input Format
First argument is the vector of intervals
second argument is the new interval to be merged



Output Format

Return the vector of intervals after merging



Example Input

Input 1:
Given intervals [1, 3], [6, 9] insert and merge [2, 5] .

Input 2:
Given intervals [1, 3], [6, 9] insert and merge [2, 6] .


Example Output
Output 1:
[ [1, 5], [6, 9] ]

Output 2:
[ [1, 9] ]


Example Explanation

Explanation 1:
(2,5) does not completely merge the given intervals

Explanation 2:
(2,6) completely merges the given intervals
 */
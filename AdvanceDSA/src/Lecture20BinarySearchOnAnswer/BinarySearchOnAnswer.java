package Lecture20BinarySearchOnAnswer;

import java.io.PrintWriter;
import java.util.Arrays;

public class BinarySearchOnAnswer {
    public static void main(String[] args) {
        int[] A = {5, 3, 6, 1, 9};
        int X1 = 7;
        int T1 = 1;
        int P1 = 3;

        int X2 = 15;
        int T2 = 1;
        int P2 = 3;

        System.out.println(painterPartitionPossibleOrNot(A, X1, T1, P1));
        System.out.println(painterPartitionPossibleOrNot(A, X2, T2, P2));

        System.out.println(minTimeToPaintAllTheBoards(A, T1, 2));

        int[] shed = {2, 6, 11, 14, 19, 25, 30, 39, 43};
        int cows = 4;

        int[] shed2 = {5, 17, 100, 11};
        int cows2 = 2;
        System.out.println(aggressiveCows(shed, cows));
        System.out.println(aggressiveCows(shed2, cows2));
    }

    /*
        Question 1: - Check if it is possible to paint all the board
        in "X" unit of time if P painters are available.
    */
    private static boolean painterPartitionPossibleOrNot(int [] A, int X, int T, int P) {
        /*
            A → Array of the size of the board in meters
            X → Total Time At Hand
            T → Time taken to paint each meter of the board
            P → Total Painters
            TC --> O(N)
            SC --> O(1)
         */

        int painters = 1 ;
        int timeTaken = 0;

        for (int j : A) {
            if (j * T > X) {
                return false;
            }
            timeTaken += j * T;
            if (timeTaken > X) {
                painters++;
                timeTaken = j * T;
                if (painters > P) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
        Question 2: - Find the minimum time to paint all boards if P painters are available.
     */

    private static int minTimeToPaintAllTheBoards(int[] A, int T, int P) {
        int start = 0 ;
        int end = 0 ;
        for (int j : A) {
            start = Math.max(start, j);
            end += j;
        }
        start *= T;
        end *= T;

        int ans = 0 ;

        while(start <= end) {
            int mid = start + (end - start) / 2 ;
            if (painterPartitionPossibleOrNot(A, mid, T, P)) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private static int aggressiveCows(int[] shed, int cows) {
        int n = shed.length;
        int s = 1;
        Arrays.sort(shed);
        int e = shed[n - 1] - shed[0];
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2 ;
            if (isPossible(shed, mid, cows)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] shed, int dist, int numberOfCows) {
        int cows = 1 ;
        int lastPos = shed[0];
        for (int i = 1; i < shed.length; i++) {
            if (shed[i] - lastPos >= dist) { // New cow can be placed here
                cows++;
                lastPos = shed[i];
                if (cows == numberOfCows) {
                    return true;
                }
            }
        }
        return false;
    }
}

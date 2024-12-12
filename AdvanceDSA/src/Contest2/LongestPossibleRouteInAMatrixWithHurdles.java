package Contest2;

public class LongestPossibleRouteInAMatrixWithHurdles {
    private static final int[] ROW = {-1, 1, 0, 0}; // Directions: Up, Down, Left, Right
    private static final int[] COL = {0, 0, -1, 1};
    private int maxPathLength = -1; // Global variable to track the maximum path length

    public int solve(int[] A, int[] B, int[][] C) {
        int n = C.length;
        int m = C[0].length;

        // Initialize a visited array to keep track of visited cells
        boolean[][] visited = new boolean[n][m];

        // Start backtracking from the source position
        backtrack(C, A[0], A[1], B[0], B[1], visited, 0);

        return maxPathLength;
    }

    private void backtrack(int[][] C, int x, int y, int destX, int destY, boolean[][] visited, int pathLength) {
        // Base cases
        if (x < 0 || y < 0 || x >= C.length || y >= C[0].length || C[x][y] == 0 || visited[x][y]) {
            return;
        }

        // If the destination is reached, update the maximum path length
        if (x == destX && y == destY) {
            maxPathLength = Math.max(maxPathLength, pathLength);
            return;
        }

        // Mark the cell as visited
        visited[x][y] = true;

        // Explore all four possible directions
        for (int i = 0; i < 4; i++) {
            int newX = x + ROW[i];
            int newY = y + COL[i];
            backtrack(C, newX, newY, destX, destY, visited, pathLength + 1);
        }

        // Unmark the cell as visited to allow other paths to explore this cell
        visited[x][y] = false;
    }

    public static void main(String[] args) {
        LongestPossibleRouteInAMatrixWithHurdles sol = new LongestPossibleRouteInAMatrixWithHurdles();
        int[] A = {0, 0};
        int[] B = {2, 2};
        int[][] C = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println(sol.solve(A, B, C)); // Output: 4
    }
}


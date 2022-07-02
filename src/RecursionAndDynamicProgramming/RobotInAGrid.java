package RecursionAndDynamicProgramming;

public class RobotInAGrid {

    private int robotInAGrid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length-1;

        return helper(matrix, m-1, n-1, new int[m+1][n+1]);

    }

    private int helper(int[][] marix, int i, int j, int[][] memo) {
        if(i<marix.length-1 || i<0 || j<marix[0].length-1 || j<0 || marix[i][j] == 1) return 0;

        if(i==0 && j==0) return 1;

        if(memo[i][j] != 0) return memo[i][j];

        memo[i][j] = helper(marix, i-1, j, memo) + helper(marix, i, j-1, memo);

        return memo[i][j];
    }
}

package ArraysAndString;

public class ZeroMatrix {

    private static void setZeroMatrix(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0 && !visited[i][j]) dfs(i, j, n, m, matrix, visited);
            }
        }
    }

    private static void dfs(int row, int col, int n, int m, int[][] matrix, boolean[][] visited) {
        visited[row][col] = true;

        for(int i=0; i<n; i++) {
            if(matrix[i][col] != 0) visited[i][col] = true;

            matrix[i][col] = 0;
        }

        for(int i=0; i<m; i++) {
            if(matrix[row][i] != 0) visited[row][i] = true;

            matrix[row][i] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        setZeroMatrix(matrix);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

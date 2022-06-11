package ArraysAndString;

public class RotateMatrix {


    private static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n/2; i++) {
            int last = n - 1 -i;
            for(int j =i; j<last; j++) {
                int offset = j-i;
                int top = matrix[i][j];

                matrix[i][j] = matrix[last-offset][i];

                matrix[last-offset][i] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[j][last];

                matrix[j][last] = top;


            }
        }
    }
    public static void main(String[] args) {
         int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }

        System.out.println();

        rotateMatrix(matrix);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

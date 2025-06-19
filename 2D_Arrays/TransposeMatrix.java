public class TransposeMatrix {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int[][] matrix = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("Original matrix:");
        printMatrix(matrix);

        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j]; 
            }
        }

        System.out.println("Transposed matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

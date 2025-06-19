public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4,  5},
            { 6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        diagonalSum(matrix);
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for(int i = 0; i < n; i++) {
            sum += matrix[i][i];
            for(int j=0;j<n;j++){
                if(i+j == n-1) {
                sum += matrix[i][i];
            }
            }
        }
        int center =  matrix[n/2][n/2];
        sum = sum - center;

        System.out.println("Total Diagonal Sum: " + sum);
    }
}

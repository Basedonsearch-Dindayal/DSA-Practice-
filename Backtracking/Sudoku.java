public class Sudoku {
    public static boolean sudokuSolver(int sudoku[][], int i,int j){
        while (i<sudoku.length && j<sudoku.length) {
            if(sudoku[i][j] == 0){
                i++;
                j++;
            }
            else{
                for(int digit=1;digit<=9;digit++){
                    // if(checkSafe(sudoku, i, j,digit)){
                        sudoku[i][j] = digit; 
                    }
                }
            }
        }
    }
    public static void checkSafe(int sudoku[][],int i,int j) {
        //check row
        for(int k = 0;k<sudoku.length;k++){
            if(sudoku[i][j] != sudoku[i][k]){
                if(sudoku[i][j] != sudoku[k][j]){
                    
                }
            }
        }
    }
    public static void main(String args[]){
        int sudoku[][]  = {
            {0, 0, 8, 0, 7, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 9, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 6},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        sudokuSolver(sudoku, 0, 0);
    }
}

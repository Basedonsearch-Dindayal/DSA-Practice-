public class nQueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
    }
    public static void nQueen(char board[][], int row) {
        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int j = 0; j<board.length;j++){
            if(ifSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] = 'X';
            }
        }
    }
    public static boolean ifSafe(char board[][], int row,int col){
        //vertical check
        for(int i = row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public static void printBoard(char board[][]) {
        System.out.println("-----------Chess Board -----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

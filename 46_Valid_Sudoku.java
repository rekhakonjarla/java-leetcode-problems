
46. Valid Sudoku
solution:-

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rowSet = new HashSet<>();
        Set<String> colSet = new HashSet<>();
		Set<String> grid = new HashSet<>();
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                
                if(!rowSet.add(String.valueOf(board[i][j]) + i) || !colSet.add(String.valueOf(board[i][j]) + j) || !grid.add(String.valueOf(board[i][j]) + i/3 + "-" + j/3)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
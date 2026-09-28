class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                int ch = board[i][j];
                if(ch != '.'){
                if(!set.add(ch+"is row"+i)
                || !set.add(ch+"is col"+j)
                || !set.add(ch+"is b"+i/3+"and"+j/3)){
                    return false;
                    }
                }
            }
        }
        return true;
    }
}

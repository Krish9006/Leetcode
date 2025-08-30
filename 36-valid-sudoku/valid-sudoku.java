class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]rows= new HashSet[9];
         HashSet<Character>[]col= new HashSet[9];
          HashSet<Character>[]boxes= new HashSet[9];
    
    for(int i=0;i<9;i++){
        rows[i]=new HashSet<>();
          col[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
    }

            for(int r=0;r<9;r++){
                for(int c=0;c<9;c++){
                    char x=board[r][c];
                    if(x=='.')continue;
                    int box=(r / 3) * 3 + (c / 3);
                    if(rows[r].contains(x))return false;
                    rows[r].add(x);
                    if(col[c].contains(x))return false;
                    col[c].add(x);
                    if(boxes[box].contains(x))return false;
                    boxes[box].add(x);
                }
            }
            return true;
    }
}
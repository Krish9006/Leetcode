class Solution {
    public int twoEggDrop(int n) {
        int moves = 0;
        int covered = 0;
        
        while (covered < n) {
            moves++;
            covered += moves;
        }
        
        return moves;
    }
}

class Solution {
    public long coloredCells(int n) {
        long  c=1;
        for(int i=1;i<n;i++){
            c+=4*i;
                    }
        return c;
    }
}
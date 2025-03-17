class Solution{ 
    public int minimumEffortPath(int[][] heights){ 
        int row=heights.length,col=heights[0].length; 
        int[][] dist=new int[row][col]; 
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}}; 
        for(int i=0;i<row;i++) 
            for(int j=0;j<col;j++) 
                dist[i][j]=Integer.MAX_VALUE; 
        dist[0][0]=0; 
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]); 
        pq.offer(new int[]{0,0,0}); 
        while(!pq.isEmpty()){ 
            int[] current=pq.poll(); 
            int effort=current[0],r=current[1],c=current[2]; 
            if(r==row-1&&c==col-1)return effort; 
            for(int[] dir:directions){ 
                int new_r=r+dir[0],new_c=c+dir[1]; 
                if(new_r>=0&&new_r<row&&new_c>=0&&new_c<col){ 
                    int new_effort=Math.max(effort,Math.abs(heights[new_r][new_c]-heights[r][c])); 
                    if(new_effort<dist[new_r][new_c]){ 
                        dist[new_r][new_c]=new_effort; 
                        pq.offer(new int[]{new_effort,new_r,new_c}); 
                    } 
                } 
            } 
        } 
        return 0; 
    } 
}

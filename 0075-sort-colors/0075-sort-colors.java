class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int noofzeroes=0,noofone=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noofzeroes++;
            if(arr[i]==1) noofone++;
        }
         for(int i=0;i<n;i++){
            if(i<noofzeroes) arr[i]=0;
            else if(i<noofzeroes+noofone) arr[i]=1;
            else arr[i]=2;
        }
       
        
        
    }
}

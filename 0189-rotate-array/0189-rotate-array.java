class Solution {
    public void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    public void reverse(int[]arr,int st,int end){
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }
}
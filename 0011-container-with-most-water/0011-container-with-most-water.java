class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int maxarea = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int width = right - left;
            int currarea = Math.min(height[left], height[right]) * width;
            if (currarea > maxarea) {
                maxarea = currarea;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxarea;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length - 1;

        int maxA = Math.min(heights[left], heights[right]) * (right - left);

        while(left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            if(area > maxA){
                maxA = area;
            }
            if(heights[left] > heights[right]){
                right --;
            } else {
                left ++;
            }
        }
        return maxA;

    }
}

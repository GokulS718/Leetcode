class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int area =0;
        int maxarea=0;
        int width=0;
        int heights=0;

        while(left < right){
            heights = Math.min(height[left],height[right]);
            width = right-left;
            area = heights * width;
            maxarea = Math.max(area , maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return maxarea;
    }
}
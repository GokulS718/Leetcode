class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int left=0;
        int sum=1;
        int c=0;
        for(int right=0;right<nums.length;right++){
            sum*=nums[right];
            while(sum>=k && left<=right){
                 sum/=nums[left];
                 left++;
            }
           c+=(right-left+1);
        }
       return c;
    }
}
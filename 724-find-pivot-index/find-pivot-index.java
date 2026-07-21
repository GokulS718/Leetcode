class Solution {
    public int pivotIndex(int[] nums) {
       int t_sum=0;
       int l_sum=0;
       for(int i=0;i<nums.length;i++){
        t_sum=t_sum +nums[i];
       } 
       for(int i=0;i<nums.length;i++){
        if((l_sum*2)+nums[i] == t_sum){
            return i;
        }
        l_sum=l_sum+nums[i];
       }
       return -1;
    }
}
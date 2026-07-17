class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left =0 ,right=0;
        int min=nums[0];
        int max=nums[0];
        int len=0;
        for(right=0;right<nums.length;right++){
             max=nums[right];
             if(max-min==1){
                 len = Math.max(right-left+1, len);
             }
             while(max-min>1){
                left++;
                min=nums[left];
             }
        }
        return len;
    }
}
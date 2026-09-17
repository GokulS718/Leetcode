class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] gd = new int[nums.length];
        int ind=0;
        int rev = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                gd[ind++]=nums[i];
            }
            else{
                gd[rev--]=nums[i];
            }
        }
        return gd;
    }
}
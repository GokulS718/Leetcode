class Solution {
    public int maximumProduct(int[] nums) {
        int sum=1;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=nums.length-3;i--){
            sum*=nums[i];
        }
        int sum1 = nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(sum,sum1);
    }
}
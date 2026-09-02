class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums , 0 ,0);
    }
    public int solve(int[] nums , int index , int total){
        if(index == nums.length) return total;

        int in = solve(nums , index+1 , nums[index] ^ total);
        int out = solve(nums , index+1 , total);

        return in+out;
    }
}
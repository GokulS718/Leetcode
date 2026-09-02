class Solution {
    public int subsetXORSum(int[] nums) {
        int total =0;
        for(int num : nums){
            total |= num;
        }
        return total << (nums.length-1);
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] s = new int[nums.length];
        s[n-1] = nums[n-1];
        for(int i=n-2 ;i>=0;i--){
            s[i]=Math.min(s[i+1] , nums[i]);
        }
        int p = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            p = Math.max(p , nums[i]);
            if(p-s[i]  <= k) return i;
        }
        return -1;
    }
}
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int pos=0;
        int neg=0;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            pos+=num;
            if(pos<0) pos=0;

            neg+=num;
            if(neg>0) neg=0;

            max = Math.max(max, Math.max(pos,Math.abs(neg)));
        }
        return max;
    }
}
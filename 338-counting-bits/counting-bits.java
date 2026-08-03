class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n+1];
        for(int i=0;i<=n;i++){
            int num = i;
            int c =0;
            while(num>0){
                 c++;
                 num = num&(num-1);
            }
            nums[i]=c;
        }
        return nums;
    }
}
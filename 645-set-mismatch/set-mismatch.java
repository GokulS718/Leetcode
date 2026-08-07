class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crt = nums[i]-1;
            if(nums[crt]!= nums[i]){
                int temp = nums[crt];
                nums[crt]= nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!= j+1){
                list.add(nums[j]);
                list.add(j+1);
            }
        }
        int len = list.size();
        int[] gd = new int[len];
        for(int mgmd=0;mgmd<len;mgmd++){
            gd[mgmd]=list.get(mgmd);
        }
        return gd;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int j=0;
        while(j < nums.length){
            int crt = nums[j]-1;
            if(nums[crt]!=nums[j]){
                int temp = nums[crt];
                nums[crt]=nums[j];
                nums[j]=temp;
            }
            else{
                j++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
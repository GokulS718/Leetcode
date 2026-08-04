class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int miss =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max , nums[i]);
            min = Math.min(min, nums[i]);
        }
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min ; i<=max ; i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
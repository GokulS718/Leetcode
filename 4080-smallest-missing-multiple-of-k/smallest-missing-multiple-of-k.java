class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        for(int i=k;;i+=k){
            if(!set.contains(i)){
                return i;
            }
        }
    }
}
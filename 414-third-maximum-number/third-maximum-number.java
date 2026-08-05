class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        if(set.size()<3) return set.last();
        set.remove(set.last());
        set.remove(set.last());
        return set.last();
    }
}
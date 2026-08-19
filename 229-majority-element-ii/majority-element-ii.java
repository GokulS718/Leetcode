class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer , Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int gd : map.keySet()){
            if(map.get(gd) > n/3){
                list.add(gd);
            }
        }
        return list;
    }
}
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map1 = new LinkedHashMap<>();
        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        for(int num : nums){
            map1.put(num , map1.getOrDefault(num,0)+1);
        }
        for(int gd : map1.keySet()){
            map2.put(map1.get(gd) , map2.getOrDefault(map1.get(gd),0)+1);
        }
        for(int va : nums){
             if(map2.get(map1.get(va))==1){
                return va;
             }
        }
        return -1;
    }
}
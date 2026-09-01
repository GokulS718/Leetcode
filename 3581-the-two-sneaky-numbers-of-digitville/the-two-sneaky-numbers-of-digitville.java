class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int gd[] = new int[2];
        for(int num : nums){
            map.put(num , map.getOrDefault(num ,0)+1);
        }
        int index=0;
        for(int gd1 : map.keySet()){
            if(map.get(gd1) == 2){
                gd[index++]=gd1;
            }
        }
        return gd;
    }
}
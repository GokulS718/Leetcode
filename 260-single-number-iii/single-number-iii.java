class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int arr[] = new int[2];
        int i=0;
        for(int gd : map.keySet()){
            if(map.get(gd)==1){
                arr[i++]=gd;
            }
        }
        return arr;
    }
}
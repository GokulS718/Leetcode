class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num1 : nums1){
            map.put(num1 , map.getOrDefault(num1,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int va = list.size();
        int gd[] = new int[va];
        for(int i=0;i<va;i++){
            gd[i]=list.get(i);
        }
        return gd;
    }
}
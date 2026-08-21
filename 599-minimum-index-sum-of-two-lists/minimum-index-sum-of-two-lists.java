class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String , Integer > map= new HashMap<>();

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int sum =0;
        int min = Integer.MAX_VALUE;
         ArrayList<String> list = new ArrayList<>();
         for(int i=0;i<list2.length;i++){
              if(map.containsKey(list2[i])){
                 sum = map.get(list2[i]) + i;
                 if(sum < min){
                    min = sum;
                    list.clear();
                    list.add(list2[i]);
                 } 
                 else if(sum ==  min){
                    list.add(list2[i]);
                 }
              }
         }
         return list.toArray(new String[0]);
    }
}
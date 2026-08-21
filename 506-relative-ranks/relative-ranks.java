class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] va = Arrays.copyOf(score, score.length);
        Arrays.sort(score);
        int pos = score.length;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i] , pos--);
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<va.length;i++){
             if(map.get(va[i]) == 1) list.add("Gold Medal");
             else if(map.get(va[i]) ==2) list.add("Silver Medal");
             else if(map.get(va[i])==3) list.add("Bronze Medal");
             else{
                String gd = String.valueOf(map.get(va[i]));
                list.add(gd);
             }
        }
       
        return list.toArray(new String[0]);
    }
}
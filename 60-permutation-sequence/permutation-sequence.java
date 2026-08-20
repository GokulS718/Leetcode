class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact =1;
        for(int i=1;i<n;i++){
            list.add(i);
            fact*=i;
        } 
        list.add(n);
        k--;
        StringBuilder sb = new StringBuilder();
        while(n>0){
             int index = k/fact;
             sb.append(list.get(index));
             list.remove(index);

             k = k % fact;
             n--;

            if(list.size() >0) fact = fact/list.size();
        }
        return sb+"";
    }
}
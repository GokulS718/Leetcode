class Solution {
    public int reverseDegree(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int n =26;
        for(char ch ='a' ;ch<='z';ch++){
            map.put(ch ,n);
            n=n-1;
        }
        int total=0;
        for(int i =0;i<s.length();i++){
            char gd = s.charAt(i);
            int dg = i+1;
              total += map.get(gd)*dg;
        }
        return total;
    }
}
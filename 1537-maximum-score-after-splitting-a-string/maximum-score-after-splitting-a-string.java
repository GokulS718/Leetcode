class Solution {
    public int maxScore(String s) {
        int totalzero=0;
        int totalone=0;
        for(char ch : s.toCharArray()){
            if(ch=='1') totalone++;
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') totalzero++;
            else totalone--;
            int sum = totalzero+totalone;
            max = Math.max(sum,max);
        }
        return max;
    }
}
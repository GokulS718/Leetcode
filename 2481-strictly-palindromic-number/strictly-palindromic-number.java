class Solution {
    public boolean isStrictlyPalindromic(int n) {
       for(int i=2;i<=n-2;i++){
         String s =Integer.toString(n,i);
         StringBuilder sb = new StringBuilder(s);
         if(!s.equals(sb.reverse().toString())){
             return false;
         }
     }
       return true;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
       String gd = strs[0];
       for(int i=1;i<strs.length;i++){
         while(!strs[i].startsWith(gd)){
            gd = gd.substring(0,gd.length()-1);
            if(gd.isEmpty()) return "";
         }
       }
       return gd;
    }
}
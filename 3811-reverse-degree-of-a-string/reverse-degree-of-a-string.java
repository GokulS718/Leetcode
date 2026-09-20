class Solution {
    public int reverseDegree(String s) {
        String gd = " zyxwvutsrqponmlkjihgfedcba";
        int sum =0;
        for(int i=0;i<s.length();i++){
             sum +=((i+1) * gd.indexOf(s.charAt(i)));
        }
        return sum;
    }
}
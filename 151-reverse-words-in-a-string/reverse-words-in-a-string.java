class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int l=0,r=str.length-1;
        while(l<r){
            String gd = str[l];
            str[l]=str[r];
            str[r]=gd;
            l++;
            r--;
        }
        StringBuilder s1 = new StringBuilder();
        for(String va : str){
            s1.append(va +" ");
        }
        return s1.toString().trim();
    }
}
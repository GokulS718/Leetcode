class Solution {
    public String reverseStr(String s, int k) {
        char[] ch =s.toCharArray();
        for(int i=0;i<ch.length;i+=(k+k)){
             int st=i;
             int end = Math.min(i + k - 1, ch.length - 1);
        while(st<end){

           char temp = ch[st];
           ch[st]=ch[end];
           ch[end]=temp;
           st++;
           end--;
          }
        }
        return new String(ch);
    }
}
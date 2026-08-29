class Solution {
    public String reverseOnlyLetters(String s) {
        int left =0;
        int right = s.length()-1;
        char s1[] = s.toCharArray();
        while(left<right){
            if(Character.isLetter( s1[left])&& Character.isLetter( s1[right])){
                char ch = s1[left];
                s1[left]= s1[right];
                 s1[right]=ch;

                left++;
                right--;
            }
            else if(Character.isLetter(s1[left])){
                right--;
            }
            else{
                left++;
            }
        }
        return new String(s1);
    }
}
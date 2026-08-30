class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag = false;
        char c = letters[0];
        for(char ch : letters){
            if(!flag){
               if(ch > target){
                  c = ch;
                  flag = !flag;
               } 
            }
        }
        return c;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        Map<Character , Integer> map = new HashMap<>();
        int length=0;
        boolean found = false;
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for(char gd : map.keySet()){
            int count = map.get(gd);
            if(count%2==0){
                  length += count;
            }
            else{
                length+= (count-1);
                found = true;
            }
        }
        return found ? length+1 : length;
    }
}
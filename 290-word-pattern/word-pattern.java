class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        String[] gd = s.trim().split("\\s+");
        if(pattern.length() != gd.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(gd[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(gd[i])) return false;

                map.put(ch,gd[i]);
            }
        }
        return true;
    }
}
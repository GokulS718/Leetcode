class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s+s;
        return s1.substring(1, s1.length()-1).contains(s);
    }
}

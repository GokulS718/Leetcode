class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char ch : ransomNote.toCharArray()){
            freq[ch-'a']++;
        }
        for(char gd : magazine.toCharArray()){
            freq[gd-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) return false;
        }
        return true;
    }
}
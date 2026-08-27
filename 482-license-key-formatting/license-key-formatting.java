class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == '-'){
                continue;
            }
            if(k == count){
                sb.append('-');
                count =0;
            }
            sb.append(ch);
            count++;
        }
        return sb.reverse().toString();
    }
}
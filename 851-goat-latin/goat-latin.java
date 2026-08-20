class Solution {
    public String toGoatLatin(String sentence) {
        String str = "maa";
        String vowels = "aeiouAEIOU";
        String[] sentences = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String gd : sentences){
            char ch = gd.charAt(0);
            if(vowels.indexOf(ch) == -1){
                  String va = gd+ch;
                  sb.append(va.substring(1)).append(str).append(" ");
                  str+="a";
                  System.out.print(va);
            }
            else{
                sb.append(gd).append(str).append(" ");
                str+="a";
            }
        }
        return new String(sb).trim();
    }
}
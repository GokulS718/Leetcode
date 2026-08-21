class Solution {
    public String[] findWords(String[] words) {
        String row1 =  "qwertyuiopQWERTYUIOP";
        String row2 =  "asdfghjklASDFGHJKL";
        String row3 =  "zxcvbnmZXCVBNM";
        ArrayList<String> list = new ArrayList<>();
        for(String s : words){
             String row="";
             String va = s;
             if(row1.indexOf(va.charAt(0)) != -1){
                row = row1;
             }
             if(row2.indexOf(va.charAt(0)) != -1){
                row = row2;
             }
             if(row3.indexOf(va.charAt(0)) != -1){
                row = row3;
             }
             boolean valid = true;
            for(int j=0;j<va.length();j++){
                char gd = va.charAt(j);
                if(row.indexOf(gd) == -1){
                    valid = false; 
                    break;
                }
            } 
            if(valid){
                    list.add(va);
                }
            
        }
        return list.toArray(new String[0]);
    }
}
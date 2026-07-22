class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i< numRows;i++){
            sb[i]=new StringBuilder();
        }

        if(numRows==1 || s.length()<=numRows){
            return s;
        }

        int rows=0;
        boolean found=false;
        for(char ch : s.toCharArray()){
           sb[rows].append(ch);
           if(rows==0 || rows == numRows-1){
              found = !found;
           }
        //    rows += found?1:-1;
        if(found) rows++;
        else rows--;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i < numRows;i++){
            res.append(sb[i]);
        }
        return res.toString();
    }
}
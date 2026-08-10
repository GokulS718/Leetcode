class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows ];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        boolean updown = false;
        int row=0;
        for(int i=0;i<s.length();i++){
            sb[row].append(s.charAt(i));
            if(row==0 || row==numRows-1){
                updown = !updown;
            }
            row+= updown?1:-1;
        }
         StringBuilder gd = new StringBuilder();
        for(int i=0;i<sb.length;i++){
           gd.append(sb[i]);
        }
        return new String(gd);
    }
}
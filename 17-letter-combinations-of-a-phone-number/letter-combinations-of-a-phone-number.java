class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> gd = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return gd;
        }

        Map<Character , String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        gd.add("");
        for(int i=0;i<digits.length();i++){
            String va = map.get(digits.charAt(i));
            List<String> ag = new ArrayList<>();
            for(String vs : gd){
                for(char ch : va.toCharArray()){
                     ag.add(vs+ch);
                }
            }
            gd=ag;
        }
        return gd;
    }
}
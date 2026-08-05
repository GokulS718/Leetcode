class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int sum =1;
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(sum);
                sum = sum* (i-j)/(j+1);
            }
            res.add(list);
        }
        return res;
    }
}
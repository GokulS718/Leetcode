class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[1] - b[1]);
        int count =0;
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            if(start < end) count++;
            else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}
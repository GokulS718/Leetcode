class Solution {
    static int convert(String time){

        String[] gd = time.split(":");
        int hour = Integer.valueOf(gd[0]);
        int min = Integer.valueOf(gd[1]);
        int crt_time = (hour*60) + min;
        return crt_time;
    }

    public boolean haveConflict(String[] event1, String[] event2) {

        int start1 = convert(event1[0]);
        int end1 = convert(event1[1]);
        int start2 = convert(event2[0]);
        int end2 = convert(event2[1]);

        return (start1<=end2) && (start2<=end1);
    }
}
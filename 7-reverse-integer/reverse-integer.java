class Solution {
    public int reverse(int x) {
        long num=0;
        int x1=x;
        if(x<0){
            x1=x*-1;
        }
        while(x1>0){
            int rem=x1%10;
            num=num*10 +rem;
            x1/=10;
        }
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE) return 0;
        if(x<0) return (int)-num;
        else  {
          
            return (int)num;
        }
    }
}
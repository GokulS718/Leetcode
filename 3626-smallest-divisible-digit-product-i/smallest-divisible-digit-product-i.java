class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int prod =1;
            int j=i;
            while(j!=0){
                int rem = j%10;
                prod = prod*rem;
                j/=10;
            }
            if(prod%t ==0){
                return i;
            }
        }
        return -1;
    }
}
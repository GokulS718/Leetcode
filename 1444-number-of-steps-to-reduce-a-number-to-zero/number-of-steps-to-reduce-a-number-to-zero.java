class Solution {
    public int numberOfSteps(int num) {
        return count(num);
    }
    static int count(int num){
        return countPossibles(num , 0);
    }
    static int countPossibles(int num , int c){
        if(num==0) return c;
        if(num%2 ==0){
            return countPossibles(num/2 , c+1);
        }
        return countPossibles(num-1 , c+1);
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> va = new HashSet<>();
        for(int num : candyType){
            va.add(num);
        }
        return Math.min(va.size() , candyType.length/2);
    }
}
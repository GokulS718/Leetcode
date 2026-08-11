class Solution {
    public int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    static int search(int[] nums , int target , int start , int end){
        int mid = start +(end - start)/2;
        if(start> end){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]>target){
            return search(nums,target,start,mid-1);
        }
        return search(nums,target,mid+1,end);
    }
}
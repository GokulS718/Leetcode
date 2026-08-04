class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permutate(nums , visited , list , result);
        return result;
    }
     
    static void permutate(int[] nums , boolean[] visited , List<Integer> list , List<List<Integer>> result){

        if(nums.length== list.size()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }

            visited[i]=true;
            list.add(nums[i]);
            permutate(nums , visited , list , result);

            list.remove(list.size()-1);
            visited[i]=false;
        }
    }

}
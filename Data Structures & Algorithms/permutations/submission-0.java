class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, res, new boolean[nums.length], new ArrayList<>());
        return res;
    }
    public static void permute(int[] nums, List<List<Integer>> res, boolean[] visited, List<Integer> temp){
        if(nums.length == temp.size()){
            res.add(new ArrayList<>(temp));
            return;
        }


        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;

            temp.add(nums[i]);
            visited[i] = true;
            permute(nums, res, visited, temp);
            temp.remove(temp.size()-1);
            visited[i] = false;
        } 
    }
}

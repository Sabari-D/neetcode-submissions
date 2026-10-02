class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int val : nums){
            if(val % 2 == 0){
                list.add(val);
            }
        }
        for(int val : nums){
            if(val % 2 != 0){
                list.add(val);
            }
        }
        int ind = 0;

        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[ind++] = list.get(i);
        }
        return res;
    }
}

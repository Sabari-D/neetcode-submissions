class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left = 0;
        Arrays.sort(nums);
        for(int right = 1; right<nums.length; right++){
            if(nums[left] == nums[right]){
                return true;
                
            }
            left++;
        }
        return false;
    }
}
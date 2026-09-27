class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(right < nums.length){
            int currentSum = nums[left]+nums[right];

            if(currentSum == target){
                return new int[]{left+1, right+1};
            }else if(currentSum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}

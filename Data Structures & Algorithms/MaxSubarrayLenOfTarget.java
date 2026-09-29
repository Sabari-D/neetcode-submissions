import java.util.*;
public class Main{
    private static int maxSumK(int[] nums, int target){
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxLen = Integer.MIN_VALUE;

        while(right < nums.length){
            currentSum += nums[right];

            while(currentSum > target){
                currentSum -= nums[left];
                left++;
            }

            if(currentSum == target){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) return;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int res = maxSumK(arr, k);
        System.out.println(res);
    }
}

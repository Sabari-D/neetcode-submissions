import java.util.*;
public class Main{
    private static int maxSumK(int[] nums, int k){
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(right < nums.length){
            currentSum += nums[right];
            if(right-left+1 < k){
                right++;
            } 
            else if(right-left+1 == k){
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= nums[left];
                left++;
                right++;
            }
            
        }
        return maxSum;
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

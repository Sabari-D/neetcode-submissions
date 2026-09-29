import java.util.*;
public class Main{
    private static int maxLenK(int[] nums, int target){
        int currentSum = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            int required = currentSum - target;

            if(map.containsKey(required)){
                maxLen = Math.max(maxLen, i-map.get(required));
            }

            if(!map.containsKey(currentSum)){
                map.put(currentSum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int target = scanner.nextInt();

        int res = maxLenK(arr, target);
        System.out.println(res);
    }
}

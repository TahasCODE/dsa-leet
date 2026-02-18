import java.util.*;

public class TwoSum {
    public static void main(String [] args){
         int [] arr = {2,4,7,9};
         printArr(arr);
        int [] arr2 =  isTwoSum(arr,6);
         printArr(arr2);
         
    }


    public static int[] isTwoSum(int [] arr, int target){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int remaining = target - arr[i];

            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining), i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }



    public static void printArr(int [] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

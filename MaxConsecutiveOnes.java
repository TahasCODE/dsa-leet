public class MaxConsecutiveOnes{
    public static void main(String [] args){
       int[] arr1 = {1,1,0,1,1,1};
       System.out.println(MCO(arr1)); 

    }


    public static int MCO(int [] nums){
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max = Math.max(count,max);
                count = 0;
            }
        }
        return Math.max(count,max);
        }
}
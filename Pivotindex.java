class Pivotindex{
    public static void main(String [] args){
           int [] arr = {1,7,3,6,5,6};
           System.out.println(findPivot(arr));
    }

    public static int findPivot(int [] nums){
         int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum = rightSum + nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == rightSum - nums[i]){
                return i;
            }
            leftSum = leftSum + nums[i];
            rightSum = rightSum - nums[i];
        }
        return -1;
    }
}
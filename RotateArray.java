class RotateArray {
 public static void main(String[] args) {
    int [] nums = {1,2,3,4,5,6,7};
    printArr(nums);
  rotate(nums, 2);
  printArr(nums);
  
 }

 public static void printArr(int [] nums){
  for(int i = 0; i < nums.length; i++){
    System.out.print(nums[i] + " ");
   }
   System.out.println( );
 }

 public static void rotate(int [] nums, int k){
   int n = nums.length;
   k = k % n; //output will be 3 because 3 is less than 7, but if k was 10 then output would be 3 because 10 % 7 = 3
   //if k is greater than n then we will rotate only the remaining part of the array, 
   // for example if k is 10 and n is 7 then we will rotate only the remaining part of the array which is 3 because 10 % 7 = 3
    // what it does is if k is greater than n then 
   // it will rotate only the remaining part of the array
   reverse(nums, 0, n - 1); // [7,6,5,4,3,2,1] -> reverse the whole array
   reverse(nums, 0, k - 1); // [5,6,7,4,3,2,1] -> reverse the first k elements 
   reverse(nums, k, n-1); // [5,6,7,1,2,3,4] -> reverse the remaining n-k elements
 }
 
 public static void reverse(int [] nums, int start , int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
             start++;
            end--;
        }
    }



    
}
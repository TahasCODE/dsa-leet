public class MOTSA1{
    public static void main(String [] args){
      int [] arr1 = {1,2,3};
      int [] arr2 = {4,5,6};
      printArr(arr1);
      printArr(arr2);
   System.out.println(MOTSA(arr1,arr2));
    }




    public static double MOTSA(int [] arr1, int [] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int [] temp = new int [m + n];  // the whole problem complicates things just 
        // cuz of this step (we will discard this in better approach)
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
         if(arr1[i] < arr2[j]) temp[k++] = arr1[i++];
         else{
            temp[k++] = arr2[j++];
         }
        }

        while(i < m){
            temp[k++] = arr1[i++];
        }
        while(j < n){
            temp[k++] = arr2[j++];
        }

        int size = m + n;
        if(size % 2 != 0){
            return temp[size/2];
        }
        else{
            return (temp[size/2] + temp[(size/2) - 1])/2.0;
        }
    }


    public static void printArr(int[] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        
        System.out.print("]");
        System.out.println();
    }
}
public class MOTSA2{
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
        int size = m + n;
        int idx1 = (size/2) - 1;
        int element1 = -1;
        int idx2 = (size/2);
        int element2 = -1;

        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
        if(arr1[i] < arr2[j]){
        if( k == idx1)
            element1 = arr1[i];
        if(k == idx2)
        element2 = arr1[i];
        i++;
        
}else{
            if(k == idx1)
                element1 = arr2[j];
            if(k == idx2)
                element2 = arr2[j]; 
            j++;
        }
        k++;
    }

        while(i < m){
             if( k == idx1)
            element1 = arr1[i];
        if(k == idx2)
            element2 = arr1[i];
        i++;
        k++;
        }
        while(j < n){
              if(k == idx1)
                element1 = arr2[j];
            if(k == idx2)
                element2 = arr2[j]; 
            j++;
            k++;
        }

       
        if(size % 2 != 0){
            return element2;
        }
        else{
            return (element1 + element2)/2.0;
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




//better approach since we are minimizing the space  complexity by getting rid of temp array o(1)
//time complexity is still O(m + n)
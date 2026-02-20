public class MOTSA3{
    public static void main(String [] args){
      int [] arr1 = {1,2,3};
      int [] arr2 = {4,5,6};
      printArr(arr1);
      printArr(arr2);
   System.out.println(MOTSA(arr1,arr2));
    }




    public static double MOTSA(int [] arr1, int [] arr2){
      if(arr1.length > arr2.length){
        return MOTSA(arr2,arr1);
      }
      int m = arr1.length;
      int n = arr2.length;
      int l = 0;
      int r = m;

      while(l <= r){
        int px = l + (r - l) / 2;
        int py = (m + n + 1)/2 - px;

        int x1 = (px == 0) ? Integer.MIN_VALUE : arr1[px - 1];
        int x3 = (px == m) ? Integer.MAX_VALUE : arr1[px];
        int x2 = (py == 0) ? Integer.MIN_VALUE : arr2[py - 1];
        int x4 = (py == n) ? Integer.MAX_VALUE : arr2[py];

        if(x1 <= x4 && x2 <= x3){
            if((m + n) % 2 == 0){
                return (Math.max(x1,x2) + Math.min(x3,x4))/2.0;
            }else{
                return Math.max(x1,x2);
            }
        }
        else if(x1 > x4){
            r = px - 1;
        }else{
          l = px + 1;
        }
      }
      return -1;
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
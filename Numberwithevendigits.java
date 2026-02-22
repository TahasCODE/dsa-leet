public class Numberwithevendigits{
public static void main(String [] args){
int [] arr1 = {12,385,482,1771};
printArr(arr1);
System.out.println(findNumber1(arr1));
printArr(arr1);
System.out.println(findNumber2(arr1));
printArr(arr1);
System.out.println(findNumber3(arr1));
printArr(arr1);
System.out.println(findNumber4(arr1));
}


public static void printArr(int[] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        
        System.out.print("]");
        System.out.println();
    }


public static boolean NumberhasevenDigits(int num){   //first approach
int digitCounts = 0;
while(num != 0){
    num = num / 10;
    digitCounts++;
}
return digitCounts % 2 == 0;
}
public static int findNumber1(int [] nums){
int evenCount = 0;

for(int i = 0; i < nums.length; i++){
    if(NumberhasevenDigits(nums[i])){
        evenCount++;
    }
}
return evenCount;
}

//2nd approach 

public static int findNumber2(int [] nums){
int evenCount = 0;
for(int num : nums){
    int len = String.valueOf(num).length();
    if(len % 2 == 0){
        evenCount++;
    }
}
return evenCount;
}

// 3rd approach

public static int findNumber3(int [] nums){
    int evenCount = 0;
    for(int num : nums){
        int digitCounts = (int) Math.floor(Math.log10(num)) + 1;
        if(digitCounts % 2 == 0){
            evenCount++;
        }
    }
    return evenCount;
}

//4th Approach

public static int findNumber4(int [] nums){
    int evenCount = 0;
    for(int num : nums){
        if((num >= 10 && num <= 99 ) || (num >= 1000 && num <= 9999) || num == 100000){
            evenCount++;
        }
    }
    return evenCount;
}




}
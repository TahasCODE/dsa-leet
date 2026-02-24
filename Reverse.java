class Reverse{
    public static void main(String [] args){
       char[] s = {'h','e','l','l','o'};
        printArr(s);
       ReverseString(s);
        printArr(s);
    }

    public static void printArr(char [] s){
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void ReverseString(char[] s){
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp  = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
     }
}
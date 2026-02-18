public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(16));
    }

    public static boolean isPowerofTwo(int n){
        if (n == 0) return false;
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }else {
                n = n / 2;
            }
            }
        return true;
        }

    }



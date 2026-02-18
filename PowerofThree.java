public class PowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerofThree(27));
    }

    public static boolean isPowerofThree(int n){
        if (n == 0) return false;
        while(n != 1){
            if(n % 3 != 0){
                return false;
            }else {
                n = n / 3;
            }
        }
        return true;
    }
}

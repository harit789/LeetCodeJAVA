package Math;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while(n>0){
            if(n==1){
                return true;
            }
            int rem = n%3;
            if(rem != 0){
                return false;
            }
            n = n/3;
        }
        return false;
    }
    
}

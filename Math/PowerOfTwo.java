package Math;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            int rem = n % 2;
            if (rem != 0) {
                return false;
            }
            n = n / 2;
        }
        return false;
    }

}

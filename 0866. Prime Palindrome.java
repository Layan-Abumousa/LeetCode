class Solution {
   public  static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int r = 0;
        while (x > r) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return x == r || x == r / 10;
    }

    public static  boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static  int primePalindrome(int n) {
        while (true) {
            if (n == reverse(n) && isPrime(n)) {
                return n;
            }
            n++;
            if (10_000_000 < n && n < 100_000_000) {
                n = 100_000_000;
            }
        }
    }

    public static int reverse(int x) {
        int r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r;
    }
}

    

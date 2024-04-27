class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        int x = n;
        if(n==1 || n==7)return true;
        while(sum > 9) {
            sum = 0;
             while (x > 0) {
                int d = x%10;
                sum += d*d;
                x/=10;
            }
            if (sum == 1||sum == 7 )
                return true;
            x = sum;
        }
       
        return false;
    }
    }

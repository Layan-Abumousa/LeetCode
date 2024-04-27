class Solution {
    public int mySqrt(int x) {
        x=Math.abs(x);
        if (x==0 || x==1) return x;
        long y=x;
        while(y*y>x){
            y=(y+x/y)/2;
        }
        return (int)y;
    }
}

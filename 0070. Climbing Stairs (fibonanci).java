class Solution {
    public int climbStairs(int n) {
      int t1=0 , t2=1 , temp=0;

      for (int i = 0 ; i <n ; i++){
           temp = t1+t2 ; 
          t1=t2;
          t2=temp;
      }
      return temp;
    
}}

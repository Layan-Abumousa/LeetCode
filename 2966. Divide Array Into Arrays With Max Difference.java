class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int [][] arr = new int [nums.length/3][3] ;
        int [][] e ={} ;
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length ; i+=3) {
            if(Math.abs(nums[i]-nums[i+1])<=k && Math.abs(nums[i]-nums[i+2])<=k){
                arr[j][0] = nums[i];
                arr[j][1] = nums[i+1];
                arr[j++][2] = nums[i+2];
              }
            else 
                return e;
                        }
        
        return arr;
        
    }
}

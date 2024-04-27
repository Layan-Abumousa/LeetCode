class Solution {
    public int firstMissingPositive(int[] nums) {
         int c = 1; 
        Arrays.sort(nums);
        if(nums.length == 0 )return 0  ;
        for (int i = 0; i < nums.length  ; i++) {
            if (nums[i]==c) {
                c++;
            }
        }
        return c ; 
    }
}

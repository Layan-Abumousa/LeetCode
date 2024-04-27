class Solution {
    public int missingNumber(int[] nums) {
        int c = 0; 
        Arrays.sort(nums);
        for (int i = 0; i < nums.length  ; i++) {
            if (nums[i]==c) {
                c++;
            }
            else return c ; 
        }
        return c ; 
    }
}

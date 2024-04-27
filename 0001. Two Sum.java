class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        
        int s = target;
        for(int i = 0; i < nums.length; i++){
            s = target - nums[i]; 
            for(int j = i+1; j < nums.length; j++ ){
                if(s == nums[j]){
                    res[0] = i;
                    res[1] = j; 
                    return res;
                }
            }

        }
        return res;
    }
}

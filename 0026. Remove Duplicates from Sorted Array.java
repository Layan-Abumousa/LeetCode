class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int element : nums) {
            set.add(element);
        }
        int i = 0 ;
        for (Integer num : set) {
            nums[i++] = num; 
        }
        
        return set.size();
        
    }
}

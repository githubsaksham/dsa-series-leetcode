class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0;i<length;i++){
            if(result.contains(nums[i]))
             return true;
            result.add(nums[i]);

        }
        return  false;
        
    }
}
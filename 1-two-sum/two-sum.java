class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<length;i++){
            int left = target- nums[i];
            if(result.containsKey(left)){
                return new int[]{result.get(left),i};
            }
            result.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
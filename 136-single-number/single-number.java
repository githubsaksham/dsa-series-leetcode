class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<length;i++){
            if(result.contains(nums[i])){
                result.remove(Integer.valueOf(nums[i]));
            }
            else{
            result.add(nums[i]);
            }
        }
        return result.get(0);
    }
}
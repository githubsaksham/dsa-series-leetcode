class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int localSum =0;
        int[] result = new int[length];

        for(int i=0;i<length;i++){
            localSum += nums[i];
            result[i] = localSum;
        } 

        return result;
        
    }
}
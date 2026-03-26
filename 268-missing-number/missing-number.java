class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int ArraySum = 0;
        int ValueSum = 0;
        for(int i=1;i<=len;i++){
            ValueSum+=i;
        }
          for(int i=0;i<len;i++){
           ArraySum+=nums[i];
        }
        return ValueSum-ArraySum;

        
    }
}
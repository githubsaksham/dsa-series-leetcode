class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int length = nums.size();
        int result = 0;
        int count = 0 ;
        for(int i=0;i<length;i++){
            if(nums[i]!=1){
                count = 0;
            }
            else{
                count++;
            }
            result =max(count, result);
        }

        return result;
        
    }
};
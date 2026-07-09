class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int length = nums.size();
        int sum = 0;
        int natural_sum = 0;
        for(int i=0;i<length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<=length;i++){
            natural_sum +=i;
        }
        return natural_sum-sum;
        
    }
};
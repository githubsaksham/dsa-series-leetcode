class Solution {
public:
    void swap(vector<int>& nums, int low , int high ){
        while(low <high){
            int temp =nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
    void rotate(vector<int>& nums, int k) {

        k=k%nums.size();
        swap(nums,0,nums.size()-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.size()-1);
        
    }
};
class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        long long low = *max_element(nums.begin(), nums.end());
        long long high = accumulate(nums.begin(), nums.end(), 0LL);

        while (low <= high) {
            long long mid = low + (high - low) / 2;

            int parts = 1;
            long long sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    parts++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if (parts <= k) {
                // Possible hai, maximum sum ko aur kam karo
                high = mid - 1;
            } else {
                // Parts zyada ban rahe hain, limit badhao
                low = mid + 1;
            }
        }

        return (int)low;
    }
};

class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        long long required = 1LL * m * k;

        if (required > bloomDay.size()) {
            return -1;
        }

        int low = *min_element(bloomDay.begin(), bloomDay.end());
        int high = *max_element(bloomDay.begin(), bloomDay.end());

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int flowers = 0;

            for (int day : bloomDay) {
                if (day <= mid) {
                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    // Adjacency breaks
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                // Enough bouquets, try fewer days
                high = mid - 1;
            } else {
                // Not enough bouquets, need more days
                low = mid + 1;
            }
        }

        return low;
    }
};
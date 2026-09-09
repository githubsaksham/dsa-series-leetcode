class Solution {
public:
    int minSpeedOnTime(vector<int>& dist, double hour) {
        int n = dist.size();

        // At least n-1 hours are needed for the first n-1 trains
        if (hour <= n - 1) {
            return -1;
        }

        int low = 1;
        int high = 10000000;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            double time = 0;

            // First n-1 distances
            for (int i = 0; i < n - 1; i++) {
                time += (dist[i] + mid - 1) / mid;
            }

            // Last distance can be fractional
            time += (double)dist[n - 1] / mid;

            if (time <= hour) {
                // Speed works, try smaller
                high = mid - 1;
            } else {
                // Speed is too slow
                low = mid + 1;
            }
        }

        return low > 10000000 ? -1 : low;
    }
};
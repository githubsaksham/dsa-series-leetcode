class Solution {
public:
    void generate(int pos, int n, string current, vector<string>& result) {
        if (pos == n) {
            result.push_back(current);
            return;
        }

        // Add 1
        generate(pos + 1, n, current + '1', result);

        // Add 0 only if previous character is not 0
        if (current.empty() || current.back() != '0') {
            generate(pos + 1, n, current + '0', result);
        }
    }

    vector<string> validStrings(int n) {
        vector<string> result;
        generate(0, n, "", result);
        return result;
    }
};
class Solution {
public:
    static vector<string> reorderLogFiles(vector<string> logs) {
        vector<string> letterLogs;
        vector<string> digitLogs;

        for (string log : logs) {
            int i = log.find(' ');

            if (isdigit(log[i + 1])) {
                digitLogs.push_back(log);
            } else {
                letterLogs.push_back(log);
            }
        }

        sort(letterLogs.begin(), letterLogs.end(), [](const string& a, const string& b) {
            int posA = a.find(' ');
            int posB = b.find(' ');

            string contentA = a.substr(posA + 1);
            string contentB = b.substr(posB + 1);

            if (contentA != contentB) {
                return contentA < contentB;
            }

            return a.substr(0, posA) < b.substr(0, posB);
        });

        letterLogs.insert(letterLogs.end(), digitLogs.begin(), digitLogs.end());

        return letterLogs;
    }
};
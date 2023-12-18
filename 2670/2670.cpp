class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        unordered_map<int, int> prefix, suffix;
        vector<int> result;
        for (int& x: nums) {
            suffix[x]++;
        }
        for (int& x: nums) {
            prefix[x]++;
            if (--suffix[x] == 0) {
                suffix.erase(x);
            }
            result.push_back(prefix.size() - suffix.size());
        }
        return result;
    }
};
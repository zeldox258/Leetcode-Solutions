class Solution {
public:
    int minimizedStringLength(string s) {
        unordered_set<char> set;
        for (char c : s) {
            set.insert(c);
        }
        return set.size();
    }
};
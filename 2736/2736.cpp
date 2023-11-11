class Solution {
public:
    int maximumSumQueries(string s) {
        unordered_set<char> seen;
        int l=0,res=0;
        for(int r=0;r<s.size();r++){
            while(seen.count(s[r])) seen.erase(s[l++]);
            seen.insert(s[r]);
            res=max(res,r-l+1);
        }
        return res;
    }
};
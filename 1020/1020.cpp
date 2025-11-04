class Solution {
public:
    vector<int> numberOfEnclaves(vector<int>& nums, int target) {
        unordered_map<int,int> m;
        for(int i=0;i<nums.size();i++){
            if(m.count(target-nums[i])) return {m[target-nums[i]],i};
            m[nums[i]]=i;
        }
        return {};
    }
};
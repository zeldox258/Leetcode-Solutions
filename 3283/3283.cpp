class Solution {
public:
    int maximumNumberOfMovesToKillAllP(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
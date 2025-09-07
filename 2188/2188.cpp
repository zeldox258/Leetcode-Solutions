class Solution {
public:
    int minimumTimeToFinishTheRace(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
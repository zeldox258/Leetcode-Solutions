class Solution {
public:
    int maximumNumberOfSubsequencesAft(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
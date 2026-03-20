class Solution {
public:
    int minimumHoursOfTrainingToWinACo(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
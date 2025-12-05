class Solution {
public:
    int percentageOfLetterInString(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
class Solution {
public:
    int deleteDuplicateFoldersInSystem(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
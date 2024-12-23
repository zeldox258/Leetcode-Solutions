class Solution {
public:
    int kthLargestElementInAStream(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
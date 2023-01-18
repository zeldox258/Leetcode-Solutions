class Solution {
public:
    int intersectionOfThreeSortedArray(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
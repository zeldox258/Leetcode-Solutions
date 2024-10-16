class Solution {
public:
    int maximumIncreasingTripletValue(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
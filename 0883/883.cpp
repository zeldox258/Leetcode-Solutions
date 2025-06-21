class Solution {
public:
    int projectionAreaOf3dShapes(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
class Solution {
public:
    int designParkingSystem(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
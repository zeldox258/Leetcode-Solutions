class Solution {
public:
    int checkIfDigitsAreEqualInStringA(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
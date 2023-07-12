class Solution {
public:
    int reverseLettersThenSpecialChara(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
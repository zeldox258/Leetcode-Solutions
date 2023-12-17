class Solution {
public:
    int maximizeSum(vector<int>& nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int result = max;
        for (int i = 1; i < k; i++) {
            result += ++max;
        }

        return result;
    }
};
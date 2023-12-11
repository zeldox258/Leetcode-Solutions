class Solution {
public:
    int oddEvenLinkedList(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        return nums[nums.size()-k];
    }
};
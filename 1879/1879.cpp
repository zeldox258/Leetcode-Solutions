class Solution {
public:
    int minimumXorSumOfTwoArrays(vector<int>& nums) {
        int cur=nums[0],mx=nums[0];
        for(int i=1;i<nums.size();i++){
            cur=max(nums[i],cur+nums[i]);
            mx=max(mx,cur);
        }
        return mx;
    }
};
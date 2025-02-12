class Solution {
public:
    int minimizeTheDifferenceBetweenTa(vector<int>& nums) {
        int l=0,r=nums.size()-1,res=0;
        while(l<r){
            res=max(res,min(nums[l],nums[r])*(r-l));
            if(nums[l]<nums[r]) l++; else r--;
        }
        return res;
    }
};
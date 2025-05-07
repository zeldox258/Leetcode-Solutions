class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> similarStringGroups(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> path;
        bt(nums,0,path);
        return res;
    }
    void bt(vector<int>& nums,int s,vector<int>& path){
        res.push_back(path);
        for(int i=s;i<nums.size();i++){
            if(i>s&&nums[i]==nums[i-1]) continue;
            path.push_back(nums[i]);bt(nums,i+1,path);path.pop_back();
        }
    }
};
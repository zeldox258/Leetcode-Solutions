class Solution {
public:
    int twoSumIvInputIsABst(vector<int>& nums, int k) {
        unordered_map<int,int> m;
        m[0]=1;
        int sum=0,count=0;
        for(int x:nums){
            sum+=x;
            if(m.count(sum-k)) count+=m[sum-k];
            m[sum]++;
        }
        return count;
    }
};
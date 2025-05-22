class Solution {
public:
    vector<int> sumOfKmirrorNumbers(vector<int>& nums) {
        int n=nums.size();
        vector<int> res(n,-1);
        stack<int> st;
        for(int i=0;i<n;i++){
            while(!st.empty()&&nums[st.top()]<nums[i]){res[st.top()]=nums[i];st.pop();}
            st.push(i);
        }
        return res;
    }
};
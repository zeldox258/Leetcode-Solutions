class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        vector<int> res;
        int i =0,j=0;
        
        while(i<n && j<m){
            if(nums1[i] > nums2[j])res.push_back(nums2[j++]);
            else res.push_back(nums1[i++]);
        }
        while(i<n){
            res.push_back(nums1[i++]);
        }
        while(j<m){
            res.push_back(nums2[j++]);
        }
        int z = res.size();
        double result = 0;
        if(z%2 == 0){
            result = res[z/2]+res[z/2-1];
            result/=2;
        }
        else{
            result = res[z/2];
        }
        
        return result;
    }
};
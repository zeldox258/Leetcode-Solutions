

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
        int n = nums1Size;
        int m = nums2Size;
        int res[n+m];
        int i =0,j=0,k=0;
        
        while(i<n && j<m){
            if(nums1[i] > nums2[j])res[k++] = nums2[j++];
            else res[k++] = nums1[i++];
        }
        while(i<n){
            res[k++] = nums1[i++];
        }
        while(j<m){
            res[k++] = nums2[j++];
        }
        int z = n+m;
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
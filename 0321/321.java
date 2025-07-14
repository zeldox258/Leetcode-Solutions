
class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m=nums1.length, n=nums2.length;
        int[] res = new int[k];
        for (int i=Math.max(0,k-n); i<=Math.min(k,m); i++) {
            int[] merged = merge(maxSubsequence(nums1,i), maxSubsequence(nums2,k-i));
            if (compare(merged,0,res,0)>0) res=merged;
        }
        return res;
    }
    int[] maxSubsequence(int[] nums, int k) {
        int[] stack = new int[k]; int top=0, drop=nums.length-k;
        for (int n:nums) {
            while (top>0&&drop>0&&stack[top-1]<n) { top--; drop--; }
            if (top<k) stack[top++]=n; else drop--;
        }
        return stack;
    }
    int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length+b.length]; int i=0,j=0,k=0;
        while (i<a.length||j<b.length)
            res[k++] = compare(a,i,b,j)>=0?a[i++]:b[j++];
        return res;
    }
    int compare(int[] a, int i, int[] b, int j) {
        while (i<a.length&&j<b.length&&a[i]==b[j]) {i++;j++;}
        if (i==a.length&&j==b.length) return 0;
        if (i==a.length) return -1; if (j==b.length) return 1;
        return a[i]-b[j];
    }
}

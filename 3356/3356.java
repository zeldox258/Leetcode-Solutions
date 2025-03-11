class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;

        if (checkAllZeroes(nums,n))
            return 0;

        int res=-1;
        int low=0;
        int high=queries.length-1;

        //O(logn)
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (solve(nums,queries,mid)) {
                res=mid+1;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }

        return res;
    }

    public boolean solve(int[] nums,int[][] queries,int k) {
        int n=nums.length;
        int[] diff=new int[n];

        //O(n)
        for (int q=0;q<=k;q++) {
            int start=queries[q][0];
            int end=queries[q][1];
            int val=queries[q][2];

            diff[start]+=val;
            if (end+1<n)
                diff[end+1]-=val;
        }

        //O(n)
        for (int i=1;i<n;i++)
            diff[i]+=diff[i-1];

        //O(n)
        return check(nums,diff,n);
    }

    public boolean check(int[] nums,int[] diff,int n) {
        for (int i=0;i<n;i++)
            if (diff[i]-nums[i]<0)
                return false;
        return true;
    }

    public boolean checkAllZeroes(int[] nums,int n) {
        for (int i=0;i<n;i++)
            if (nums[i]!=0)
                return false;

        return true;
    }
}
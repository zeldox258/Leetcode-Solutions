class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,n=nums.length;
        for(int x:nums){min=Math.min(min,x);max=Math.max(max,x);}
        if(min==max) return 0;
        int bucketSize=Math.max(1,(max-min)/(n-1));
        int bucketCount=(max-min)/bucketSize+1;
        int[] bmin=new int[bucketCount],bmax=new int[bucketCount];
        java.util.Arrays.fill(bmin,Integer.MAX_VALUE);java.util.Arrays.fill(bmax,Integer.MIN_VALUE);
        for(int x:nums){int idx=(x-min)/bucketSize;bmin[idx]=Math.min(bmin[idx],x);bmax[idx]=Math.max(bmax[idx],x);}
        int maxGap=0,prev=max;
        for(int i=bucketCount-1;i>=0;i--){if(bmin[i]==Integer.MAX_VALUE)continue;maxGap=Math.max(maxGap,prev-bmax[i]);prev=bmin[i];}
        return maxGap;
    }
}
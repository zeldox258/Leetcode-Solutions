
class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen){return Math.max(helper(nums,firstLen,secondLen),helper(nums,secondLen,firstLen));}
    int helper(int[]a,int L,int M){int n=a.length;int[]pre=new int[n+1];for(int i=0;i<n;i++)pre[i+1]=pre[i]+a[i];int res=0,maxL=0;for(int i=L+M;i<=n;i++){maxL=Math.max(maxL,pre[i-M]-pre[i-M-L]);res=Math.max(res,maxL+pre[i]-pre[i-M]);}return res;}
}

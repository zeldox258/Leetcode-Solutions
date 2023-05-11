
class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n=books.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int w=0,h=0;
            for(int j=i;j>=1;j--){
                w+=books[j-1][0]; h=Math.max(h,books[j-1][1]);
                if(w>shelfWidth) break;
                dp[i]=Math.min(dp[i],dp[j-1]+h);
            }
        }
        return dp[n];
    }
}

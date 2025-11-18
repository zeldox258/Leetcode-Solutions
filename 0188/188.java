class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(k>=n/2){int profit=0;for(int i=1;i<n;i++) if(prices[i]>prices[i-1])profit+=prices[i]-prices[i-1];return profit;}
        int[] buy=new int[k],sell=new int[k];
        java.util.Arrays.fill(buy,Integer.MIN_VALUE);
        for(int p:prices){for(int i=k-1;i>0;i--){sell[i]=Math.max(sell[i],buy[i]+p);buy[i]=Math.max(buy[i],sell[i-1]-p);}sell[0]=Math.max(sell[0],buy[0]+p);buy[0]=Math.max(buy[0],-p);}
        return sell[k-1];
    }
}
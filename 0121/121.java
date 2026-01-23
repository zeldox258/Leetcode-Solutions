class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,maxProfit=0;
        for(int p:prices){minPrice=Math.min(minPrice,p);maxProfit=Math.max(maxProfit,p-minPrice);}
        return maxProfit;
    }
}
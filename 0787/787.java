
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n]; Arrays.fill(prices, Integer.MAX_VALUE); prices[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] tmp = Arrays.copyOf(prices, n);
            for (int[] f : flights) {
                if (prices[f[0]] != Integer.MAX_VALUE && prices[f[0]] + f[2] < tmp[f[1]])
                    tmp[f[1]] = prices[f[0]] + f[2];
            }
            prices = tmp;
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n];
        
        prefix[0] = nums.get(0);
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums.get(i);
        }
        
        int minSum = Integer.MAX_VALUE;
        
        for (int length = l; length <= r; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;
                int subarraySum = prefix[end] - (start > 0 ? prefix[start - 1] : 0);
                if(subarraySum>0){
                    minSum = Math.min(minSum,subarraySum);
                }
            }
        }
        return minSum == Integer.MAX_VALUE?-1:minSum;
    }
}
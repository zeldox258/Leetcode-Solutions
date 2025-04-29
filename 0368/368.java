class Solution {
     public List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        
        int n  = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        
        int max = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    max = Math.max(dp[i],max);
                }
            }
        }
        
        
        int prev = -1;
        for (int i = n-1; i >=0; i--) {
            if (dp[i] == max && (prev == -1 || prev % nums[i] == 0)) {
                res.add(nums[i]);
                prev = nums[i];
                max--;
            }
        }    
        
        return res;
    }
}
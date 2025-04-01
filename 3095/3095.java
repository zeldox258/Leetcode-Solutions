class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            int val = 0;

            for(int j = i; j<n; j++){
                val|=nums[j];

                if(val>=k){
                    ans = Math.min(ans,j-i+1);
                }
            }
        }

        return ans == Integer.MAX_VALUE?-1:ans;

    }
}
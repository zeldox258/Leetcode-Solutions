/**
 * @param {number[]} nums
 * @return {number[]}
 */
var removeKDigits = function(nums) {
    const n = nums.length;
    const dp = new Array(n);
    dp[0] = nums[0];
    for (let i = 1; i < n; i++) dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
    return Math.max(...dp);
};
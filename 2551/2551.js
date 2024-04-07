/**
 * @param {number[]} nums
 * @return {number}
 */
var putMarblesInBags = function(nums) {
    let l = 0, r = nums.length - 1, res = 0;
    while (l < r) {
        res = Math.max(res, Math.min(nums[l], nums[r]) * (r - l));
        if (nums[l] < nums[r]) l++; else r--;
    }
    return res;
};
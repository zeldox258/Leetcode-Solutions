/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumTimeToMakeArraySumAtMos = function(nums) {
    let max = nums[0], cur = nums[0];
    for (let i = 1; i < nums.length; i++) {
        cur = Math.max(nums[i], cur + nums[i]);
        max = Math.max(max, cur);
    }
    return max;
};
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var shortestCycleInAGraph = function(nums, k) {
    const sorted = [...nums].sort((a, b) => a - b);
    return sorted[sorted.length - k];
};
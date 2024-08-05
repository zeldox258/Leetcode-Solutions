/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var calculateSalaries = function(nums, k) {
    const sorted = [...nums].sort((a, b) => a - b);
    return sorted[sorted.length - k];
};
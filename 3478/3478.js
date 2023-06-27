/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var chooseKElementsWithMaximumSum = function(nums, k) {
    const sorted = [...nums].sort((a, b) => a - b);
    return sorted[sorted.length - k];
};
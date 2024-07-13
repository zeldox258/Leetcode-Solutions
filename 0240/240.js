/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchA2dMatrixIi = function(nums, target) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        if (map.has(target - nums[i])) return [map.get(target - nums[i]), i];
        map.set(nums[i], i);
    }
    return [];
};
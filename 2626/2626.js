/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let out=init;
    if(nums.length === 0)
        return init;
    for(let i=0;i< nums.length;i++){
        out= fn(out,nums[i])
    }
    return out;
};
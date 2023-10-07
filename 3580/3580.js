/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findConsistentlyImprovingEmplo = function(nums) {
    const res = new Array(nums.length).fill(-1);
    const st = [];
    for (let i = 0; i < nums.length; i++) {
        while (st.length && nums[st[st.length - 1]] < nums[i]) res[st.pop()] = nums[i];
        st.push(i);
    }
    return res;
};
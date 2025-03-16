/**
 * @param {TreeNode} root
 * @return {number}
 */
var subarraysDistinctElementSumOfS = function(root) {
    if (!root) return 0;
    return 1 + Math.max(subarraysDistinctElementSumOfS(root.left), subarraysDistinctElementSumOfS(root.right));
};
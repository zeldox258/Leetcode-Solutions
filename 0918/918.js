/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumSumCircularSubarray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumSumCircularSubarray(root.left), maximumSumCircularSubarray(root.right));
};
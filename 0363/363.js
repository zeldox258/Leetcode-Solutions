/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxSumOfRectangleNoLargerThanK = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maxSumOfRectangleNoLargerThanK(root.left), maxSumOfRectangleNoLargerThanK(root.right));
};
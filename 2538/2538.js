/**
 * @param {TreeNode} root
 * @return {number}
 */
var differenceBetweenMaximumAndMin = function(root) {
    if (!root) return 0;
    return 1 + Math.max(differenceBetweenMaximumAndMin(root.left), differenceBetweenMaximumAndMin(root.right));
};
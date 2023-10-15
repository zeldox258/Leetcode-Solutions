/**
 * @param {TreeNode} root
 * @return {number}
 */
var findMaximumAreaOfATriangle = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findMaximumAreaOfATriangle(root.left), findMaximumAreaOfATriangle(root.right));
};
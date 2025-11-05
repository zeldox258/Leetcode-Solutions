/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestCommonSubpath = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSubpath(root.left), longestCommonSubpath(root.right));
};
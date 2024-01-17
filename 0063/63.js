/**
 * @param {TreeNode} root
 * @return {number}
 */
var uniquePathsIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(uniquePathsIi(root.left), uniquePathsIi(root.right));
};
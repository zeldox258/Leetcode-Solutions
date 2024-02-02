/**
 * @param {TreeNode} root
 * @return {number}
 */
var subsets = function(root) {
    if (!root) return 0;
    return 1 + Math.max(subsets(root.left), subsets(root.right));
};
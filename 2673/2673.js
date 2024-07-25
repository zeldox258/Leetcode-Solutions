/**
 * @param {TreeNode} root
 * @return {number}
 */
var makeCostsOfPathsEqualInABinary = function(root) {
    if (!root) return 0;
    return 1 + Math.max(makeCostsOfPathsEqualInABinary(root.left), makeCostsOfPathsEqualInABinary(root.right));
};
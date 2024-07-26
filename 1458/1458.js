/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDotProductOfTwoSubsequences = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maxDotProductOfTwoSubsequences(root.left), maxDotProductOfTwoSubsequences(root.right));
};
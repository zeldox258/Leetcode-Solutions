/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestArithmeticSubsequenceOf = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestArithmeticSubsequenceOf(root.left), longestArithmeticSubsequenceOf(root.right));
};
/**
 * @param {TreeNode} root
 * @return {number}
 */
var bagOfTokens = function(root) {
    if (!root) return 0;
    return 1 + Math.max(bagOfTokens(root.left), bagOfTokens(root.right));
};
/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestSubstringWithoutRepeati = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestSubstringWithoutRepeati(root.left), longestSubstringWithoutRepeati(root.right));
};
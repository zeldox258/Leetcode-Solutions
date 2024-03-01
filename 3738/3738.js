/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestNondecreasingSubarrayAf = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestNondecreasingSubarrayAf(root.left), longestNondecreasingSubarrayAf(root.right));
};
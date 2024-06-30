/**
 * @param {TreeNode} root
 * @return {number}
 */
var summaryRanges = function(root) {
    if (!root) return 0;
    return 1 + Math.max(summaryRanges(root.left), summaryRanges(root.right));
};
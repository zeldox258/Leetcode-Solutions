/**
 * @param {TreeNode} root
 * @return {number}
 */
var queryKthSmallestTrimmedNumber = function(root) {
    if (!root) return 0;
    return 1 + Math.max(queryKthSmallestTrimmedNumber(root.left), queryKthSmallestTrimmedNumber(root.right));
};
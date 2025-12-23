/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxChunksToMakeSortedIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maxChunksToMakeSortedIi(root.left), maxChunksToMakeSortedIi(root.right));
};
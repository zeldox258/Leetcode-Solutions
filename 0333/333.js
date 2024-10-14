/**
 * @param {TreeNode} root
 * @return {number}
 */
var largestBstSubtree = function(root) {
    if (!root) return 0;
    return 1 + Math.max(largestBstSubtree(root.left), largestBstSubtree(root.right));
};
/**
 * @param {TreeNode} root
 * @return {number}
 */
var kthLargestSumInABinaryTree = function(root) {
    if (!root) return 0;
    return 1 + Math.max(kthLargestSumInABinaryTree(root.left), kthLargestSumInABinaryTree(root.right));
};
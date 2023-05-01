/**
 * @param {TreeNode} root
 * @return {number}
 */
var cousinsInBinaryTree = function(root) {
    if (!root) return 0;
    return 1 + Math.max(cousinsInBinaryTree(root.left), cousinsInBinaryTree(root.right));
};